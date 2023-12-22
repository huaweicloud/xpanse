/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 *
 */

package org.eclipse.xpanse.plugins.huaweicloud.manage;

import static org.eclipse.xpanse.plugins.huaweicloud.common.HuaweiCloudRetryStrategy.DEFAULT_DELAY_MILLIS;
import static org.eclipse.xpanse.plugins.huaweicloud.common.HuaweiCloudRetryStrategy.DEFAULT_RETRY_TIMES;

import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.ecs.v2.EcsClient;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowJobResponse.StatusEnum;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.xpanse.modules.credential.CredentialCenter;
import org.eclipse.xpanse.modules.models.credential.AbstractCredentialInfo;
import org.eclipse.xpanse.modules.models.credential.enums.CredentialType;
import org.eclipse.xpanse.modules.models.service.common.enums.Csp;
import org.eclipse.xpanse.modules.orchestrator.manage.ServiceManagerRequest;
import org.eclipse.xpanse.plugins.huaweicloud.common.HuaweiCloudClient;
import org.eclipse.xpanse.plugins.huaweicloud.common.HuaweiCloudRetryStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class that encapsulates all Manager-related public methods of the Huawei Cloud plugin.
 */
@Slf4j
@Component
public class HuaweiCloudVmStateManager {
    private final CredentialCenter credentialCenter;
    private final HuaweiCloudClient huaweiCloudClient;
    private final HuaweiCloudServerManageRequestConverter converter;

    /**
     * Constructs a HuaweiCloudVmStateManager with the necessary dependencies.
     */
    @Autowired
    public HuaweiCloudVmStateManager(CredentialCenter credentialCenter,
                                     HuaweiCloudClient huaweiCloudClient,
                                     HuaweiCloudServerManageRequestConverter converter) {
        this.credentialCenter = credentialCenter;
        this.huaweiCloudClient = huaweiCloudClient;
        this.converter = converter;
    }

    /**
     * Start the Huawei Cloud Ecs server.
     */
    public boolean startService(ServiceManagerRequest serviceManagerRequest) {
        EcsClient ecsClient = getEcsClient(serviceManagerRequest);
        BatchStartServersRequest request =
                converter.buildBatchStartServersRequest(
                        serviceManagerRequest.getDeployResourceEntityList());
        BatchStartServersResponse response = ecsClient.batchStartServersInvoker(request)
                .retryTimes(DEFAULT_RETRY_TIMES)
                .retryCondition(huaweiCloudClient::matchRetryCondition)
                .backoffStrategy(new HuaweiCloudRetryStrategy(DEFAULT_DELAY_MILLIS))
                .invoke();
        return checkEcsExecResultByJobId(ecsClient, response.getJobId());
    }

    /**
     * Stop the Huawei Cloud Ecs server.
     */
    public boolean stopService(ServiceManagerRequest serviceManagerRequest) {
        EcsClient ecsClient = getEcsClient(serviceManagerRequest);
        BatchStopServersRequest batchStopServersRequest =
                converter.buildBatchStopServersRequest(
                        serviceManagerRequest.getDeployResourceEntityList());
        BatchStopServersResponse response =
                ecsClient.batchStopServersInvoker(batchStopServersRequest)
                        .retryTimes(DEFAULT_RETRY_TIMES)
                        .retryCondition(huaweiCloudClient::matchRetryCondition)
                        .backoffStrategy(new HuaweiCloudRetryStrategy(DEFAULT_DELAY_MILLIS))
                        .invoke();
        return checkEcsExecResultByJobId(ecsClient, response.getJobId());
    }

    /**
     * Restart the Huawei Cloud Ecs server.
     */
    public boolean restartService(ServiceManagerRequest serviceManagerRequest) {
        EcsClient ecsClient = getEcsClient(serviceManagerRequest);
        BatchRebootServersRequest request =
                converter.buildBatchRebootServersRequest(
                        serviceManagerRequest.getDeployResourceEntityList());
        BatchRebootServersResponse response = ecsClient.batchRebootServersInvoker(request)
                .retryTimes(DEFAULT_RETRY_TIMES)
                .retryCondition(huaweiCloudClient::matchRetryCondition)
                .backoffStrategy(new HuaweiCloudRetryStrategy(DEFAULT_DELAY_MILLIS))
                .invoke();
        return checkEcsExecResultByJobId(ecsClient, response.getJobId());
    }

    private EcsClient getEcsClient(ServiceManagerRequest serviceManagerRequest) {
        AbstractCredentialInfo credential =
                credentialCenter.getCredential(Csp.HUAWEI, CredentialType.VARIABLES,
                        serviceManagerRequest.getUserId());
        ICredential icredential = huaweiCloudClient.getCredential(credential);
        return huaweiCloudClient.getEcsClient(icredential, serviceManagerRequest.getRegionName());
    }

    private boolean checkEcsExecResultByJobId(EcsClient ecsClient, String jobId) {
        ShowJobResponse response = ecsClient.showJobInvoker(new ShowJobRequest().withJobId(jobId))
                .retryTimes(DEFAULT_RETRY_TIMES)
                .retryCondition((resp, ex) -> Objects.nonNull(ex)
                        && !resp.getStatus().equals(ShowJobResponse.StatusEnum.SUCCESS))
                .backoffStrategy(new HuaweiCloudRetryStrategy(DEFAULT_DELAY_MILLIS))
                .invoke();
        if (response.getStatus().equals(StatusEnum.FAIL)) {
            log.error("manage vm operation failed. JobId: {} reason: {} message: {}", jobId,
                    response.getFailReason(), response.getMessage());
        }
        return response.getStatus().equals(StatusEnum.SUCCESS);
    }

}
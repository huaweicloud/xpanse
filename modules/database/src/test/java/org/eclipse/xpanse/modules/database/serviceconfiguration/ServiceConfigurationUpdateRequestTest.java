/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 *
 */

package org.eclipse.xpanse.modules.database.serviceconfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Map;
import java.util.UUID;
import org.eclipse.xpanse.modules.database.service.DeployServiceEntity;
import org.eclipse.xpanse.modules.database.serviceconfiguration.update.ServiceConfigurationUpdateRequest;
import org.eclipse.xpanse.modules.database.serviceorder.ServiceOrderEntity;
import org.eclipse.xpanse.modules.models.serviceconfiguration.enums.ServiceConfigurationStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;

/**
 * Test for ServiceConfigurationUpdateRequest.
 */
public class ServiceConfigurationUpdateRequestTest {

    final UUID id = UUID.randomUUID();
    final String resourceName = "zookeeper-1234";
    final String configManager = "zookeeper";
    final String resultMessage = "resultMessage";
    final Map<String, Object> properties = Map.of("k1", "v1" , "k2", "v2");
    final ServiceConfigurationStatus status = ServiceConfigurationStatus.PENDING;
    @Mock
    private DeployServiceEntity deployServiceEntity;
    @Mock
    private ServiceOrderEntity serviceOrderEntity;

    private ServiceConfigurationUpdateRequest test;

    @BeforeEach
    void setUp() {
        test = new ServiceConfigurationUpdateRequest();
        test.setId(id);
        test.setDeployServiceEntity(deployServiceEntity);
        test.setServiceOrderEntity(serviceOrderEntity);
        test.setResourceName(resourceName);
        test.setConfigManager(configManager);
        test.setResultMessage(resultMessage);
        test.setStatus(status);
        test.setProperties(properties);
    }

    @Test
    void testGetters() {
        assertThat(test.getId()).isEqualTo(id);
        assertThat(test.getDeployServiceEntity()).isEqualTo(deployServiceEntity);
        assertThat(test.getServiceOrderEntity()).isEqualTo(serviceOrderEntity);
        assertThat(test.getResourceName()).isEqualTo(resourceName);
        assertThat(test.getConfigManager()).isEqualTo(configManager);
        assertThat(test.getResultMessage()).isEqualTo(resultMessage);
        assertThat(test.getStatus()).isEqualTo(status);
        assertThat(test.getProperties()).isEqualTo(properties);
    }

    @Test
    void testEquals() {
        assertThat(test.equals(new Object())).isFalse();
        ServiceConfigurationUpdateRequest test1 = new ServiceConfigurationUpdateRequest();
        BeanUtils.copyProperties(test, test1);
        assertThat(test.equals(test1)).isTrue();
    }


    @Test
    void testHashCode() {
        assertThat(test.hashCode() == new Object().hashCode()).isFalse();
        ServiceConfigurationUpdateRequest test1 = new ServiceConfigurationUpdateRequest();
        BeanUtils.copyProperties(test, test1);
        assertThat(test.hashCode() == test1.hashCode()).isTrue();
    }

    @Test
    void testToString() {
        String result = String.format(
                "ServiceConfigurationUpdateRequest(id=%s, "
                        + "serviceOrderEntity=%s, "
                        + "deployServiceEntity=%s, "
                        + "resourceName=%s, "
                        + "configManager=%s, "
                        + "resultMessage=%s, "
                        + "properties=%s, "
                        + "status=%s)", id, serviceOrderEntity, deployServiceEntity, resourceName, configManager,
                resultMessage, properties, status);

        assertThat(test.toString()).isEqualTo(result);
    }

}

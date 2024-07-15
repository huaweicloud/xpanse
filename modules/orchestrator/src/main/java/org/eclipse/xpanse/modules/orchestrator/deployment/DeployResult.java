/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.modules.orchestrator.deployment;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lombok.Data;
import org.eclipse.xpanse.modules.models.service.deploy.DeployResource;
import org.eclipse.xpanse.modules.models.service.enums.DeployerTaskStatus;

/**
 * The result of the deployment.
 */
@Data
public class DeployResult {

    @NotNull
    @Schema(description = "The id of the service order task.")
    private UUID orderId;

    @NotNull
    @Schema(description = "The id of the managed service instance.")
    private UUID serviceId;

    @NotNull
    @Schema(description = "True if the deployer task is successful.")
    private Boolean isTaskSuccessful;

    @NotNull
    @Schema(description = "The state of the deployer task.")
    private DeployerTaskStatus state;

    @Schema(description = "The message of the service order task.")
    private String message;

    @NotNull
    @Schema(description = "The deployed resources of the service instance.")
    private List<@Valid DeployResource> resources;

    @NotNull
    @Schema(description = "The result properties of the service instance.")
    private Map<String, String> properties = new HashMap<>();

    @NotNull
    @Schema(description = "The private properties of the service instance deployment.")
    private Map<String, String> privateProperties = new HashMap<>();

    @Hidden
    private String tfStateContent;

}

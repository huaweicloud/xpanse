/*
 * Tofu-Maker API
 * RESTful Services to interact with Tofu-Maker runtime
 *
 * The version of the OpenAPI document: 1.0.9-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.eclipse.xpanse.modules.deployment.deployers.opentofu.tofumaker.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * OpenTofuAsyncDeployFromDirectoryRequest
 */
@JsonPropertyOrder({
        OpenTofuAsyncDeployFromDirectoryRequest.JSON_PROPERTY_REQUEST_ID,
        OpenTofuAsyncDeployFromDirectoryRequest.JSON_PROPERTY_OPEN_TOFU_VERSION,
        OpenTofuAsyncDeployFromDirectoryRequest.JSON_PROPERTY_IS_PLAN_ONLY,
        OpenTofuAsyncDeployFromDirectoryRequest.JSON_PROPERTY_VARIABLES,
        OpenTofuAsyncDeployFromDirectoryRequest.JSON_PROPERTY_ENV_VARIABLES,
        OpenTofuAsyncDeployFromDirectoryRequest.JSON_PROPERTY_WEBHOOK_CONFIG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class OpenTofuAsyncDeployFromDirectoryRequest {
    public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
    public static final String JSON_PROPERTY_OPEN_TOFU_VERSION = "openTofuVersion";
    public static final String JSON_PROPERTY_IS_PLAN_ONLY = "isPlanOnly";
    public static final String JSON_PROPERTY_VARIABLES = "variables";
    public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
    public static final String JSON_PROPERTY_WEBHOOK_CONFIG = "webhookConfig";
    private UUID requestId;
    private String openTofuVersion;
    private Boolean isPlanOnly;
    private Map<String, Object> variables = new HashMap<>();
    private Map<String, String> envVariables = new HashMap<>();
    private WebhookConfig webhookConfig;

    public OpenTofuAsyncDeployFromDirectoryRequest() {
    }

    public OpenTofuAsyncDeployFromDirectoryRequest requestId(UUID requestId) {

        this.requestId = requestId;
        return this;
    }

    /**
     * Id of the request.
     *
     * @return requestId
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_REQUEST_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public UUID getRequestId() {
        return requestId;
    }


    @JsonProperty(JSON_PROPERTY_REQUEST_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public OpenTofuAsyncDeployFromDirectoryRequest openTofuVersion(String openTofuVersion) {

        this.openTofuVersion = openTofuVersion;
        return this;
    }

    /**
     * The required version of the OpenTofu which will execute the scripts.
     *
     * @return openTofuVersion
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_OPEN_TOFU_VERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getOpenTofuVersion() {
        return openTofuVersion;
    }


    @JsonProperty(JSON_PROPERTY_OPEN_TOFU_VERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOpenTofuVersion(String openTofuVersion) {
        this.openTofuVersion = openTofuVersion;
    }

    public OpenTofuAsyncDeployFromDirectoryRequest isPlanOnly(Boolean isPlanOnly) {

        this.isPlanOnly = isPlanOnly;
        return this;
    }

    /**
     * Flag to control if the deployment must only generate the OpenTofu or it must also apply the changes.
     *
     * @return isPlanOnly
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IS_PLAN_ONLY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Boolean getIsPlanOnly() {
        return isPlanOnly;
    }


    @JsonProperty(JSON_PROPERTY_IS_PLAN_ONLY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsPlanOnly(Boolean isPlanOnly) {
        this.isPlanOnly = isPlanOnly;
    }

    public OpenTofuAsyncDeployFromDirectoryRequest variables(Map<String, Object> variables) {

        this.variables = variables;
        return this;
    }

    public OpenTofuAsyncDeployFromDirectoryRequest putVariablesItem(String key,
                                                                    Object variablesItem) {
        this.variables.put(key, variablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be used to execute the OpenTofu request.
     *
     * @return variables
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Map<String, Object> getVariables() {
        return variables;
    }


    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    public OpenTofuAsyncDeployFromDirectoryRequest envVariables(Map<String, String> envVariables) {

        this.envVariables = envVariables;
        return this;
    }

    public OpenTofuAsyncDeployFromDirectoryRequest putEnvVariablesItem(String key,
                                                                       String envVariablesItem) {
        if (this.envVariables == null) {
            this.envVariables = new HashMap<>();
        }
        this.envVariables.put(key, envVariablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be injected as environment variables to OpenTofu process.
     *
     * @return envVariables
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_ENV_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, String> getEnvVariables() {
        return envVariables;
    }


    @JsonProperty(JSON_PROPERTY_ENV_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnvVariables(Map<String, String> envVariables) {
        this.envVariables = envVariables;
    }

    public OpenTofuAsyncDeployFromDirectoryRequest webhookConfig(WebhookConfig webhookConfig) {

        this.webhookConfig = webhookConfig;
        return this;
    }

    /**
     * Get webhookConfig
     *
     * @return webhookConfig
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIG)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public WebhookConfig getWebhookConfig() {
        return webhookConfig;
    }


    @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIG)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setWebhookConfig(WebhookConfig webhookConfig) {
        this.webhookConfig = webhookConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenTofuAsyncDeployFromDirectoryRequest openTofuAsyncDeployFromDirectoryRequest =
                (OpenTofuAsyncDeployFromDirectoryRequest) o;
        return Objects.equals(this.requestId, openTofuAsyncDeployFromDirectoryRequest.requestId) &&
                Objects.equals(this.openTofuVersion,
                        openTofuAsyncDeployFromDirectoryRequest.openTofuVersion) &&
                Objects.equals(this.isPlanOnly, openTofuAsyncDeployFromDirectoryRequest.isPlanOnly)
                &&
                Objects.equals(this.variables, openTofuAsyncDeployFromDirectoryRequest.variables) &&
                Objects.equals(this.envVariables,
                        openTofuAsyncDeployFromDirectoryRequest.envVariables) &&
                Objects.equals(this.webhookConfig,
                        openTofuAsyncDeployFromDirectoryRequest.webhookConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, openTofuVersion, isPlanOnly, variables, envVariables,
                webhookConfig);
    }

    @Override
    public String toString() {
        String sb = "class OpenTofuAsyncDeployFromDirectoryRequest {\n"
                + "    requestId: " + toIndentedString(requestId) + "\n"
                + "    openTofuVersion: " + toIndentedString(openTofuVersion) + "\n"
                + "    isPlanOnly: " + toIndentedString(isPlanOnly) + "\n"
                + "    variables: " + toIndentedString(variables) + "\n"
                + "    envVariables: " + toIndentedString(envVariables) + "\n"
                + "    webhookConfig: " + toIndentedString(webhookConfig) + "\n"
                + "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}


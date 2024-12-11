/*
 * Tofu-Maker API
 * RESTful Services to interact with Tofu-Maker runtime
 *
 * The version of the OpenAPI document: 1.0.10-SNAPSHOT
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

/** OpenTofuAsyncDestroyFromGitRepoRequest */
@JsonPropertyOrder({
    OpenTofuAsyncDestroyFromGitRepoRequest.JSON_PROPERTY_REQUEST_ID,
    OpenTofuAsyncDestroyFromGitRepoRequest.JSON_PROPERTY_OPEN_TOFU_VERSION,
    OpenTofuAsyncDestroyFromGitRepoRequest.JSON_PROPERTY_VARIABLES,
    OpenTofuAsyncDestroyFromGitRepoRequest.JSON_PROPERTY_ENV_VARIABLES,
    OpenTofuAsyncDestroyFromGitRepoRequest.JSON_PROPERTY_GIT_REPO_DETAILS,
    OpenTofuAsyncDestroyFromGitRepoRequest.JSON_PROPERTY_TF_STATE,
    OpenTofuAsyncDestroyFromGitRepoRequest.JSON_PROPERTY_WEBHOOK_CONFIG
})
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator " + "version: 7.10.0")
public class OpenTofuAsyncDestroyFromGitRepoRequest {
    public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
    @jakarta.annotation.Nullable private UUID requestId;

    public static final String JSON_PROPERTY_OPEN_TOFU_VERSION = "openTofuVersion";
    @jakarta.annotation.Nonnull private String openTofuVersion;

    public static final String JSON_PROPERTY_VARIABLES = "variables";
    @jakarta.annotation.Nonnull private Map<String, Object> variables = new HashMap<>();

    public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
    @jakarta.annotation.Nullable private Map<String, String> envVariables = new HashMap<>();

    public static final String JSON_PROPERTY_GIT_REPO_DETAILS = "gitRepoDetails";
    @jakarta.annotation.Nullable private OpenTofuScriptGitRepoDetails gitRepoDetails;

    public static final String JSON_PROPERTY_TF_STATE = "tfState";
    @jakarta.annotation.Nonnull private String tfState;

    public static final String JSON_PROPERTY_WEBHOOK_CONFIG = "webhookConfig";
    @jakarta.annotation.Nonnull private WebhookConfig webhookConfig;

    public OpenTofuAsyncDestroyFromGitRepoRequest() {}

    public OpenTofuAsyncDestroyFromGitRepoRequest requestId(
            @jakarta.annotation.Nullable UUID requestId) {

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
    public void setRequestId(@jakarta.annotation.Nullable UUID requestId) {
        this.requestId = requestId;
    }

    public OpenTofuAsyncDestroyFromGitRepoRequest openTofuVersion(
            @jakarta.annotation.Nonnull String openTofuVersion) {

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
    public void setOpenTofuVersion(@jakarta.annotation.Nonnull String openTofuVersion) {
        this.openTofuVersion = openTofuVersion;
    }

    public OpenTofuAsyncDestroyFromGitRepoRequest variables(
            @jakarta.annotation.Nonnull Map<String, Object> variables) {

        this.variables = variables;
        return this;
    }

    public OpenTofuAsyncDestroyFromGitRepoRequest putVariablesItem(
            String key, Object variablesItem) {
        this.variables.put(key, variablesItem);
        return this;
    }

    /**
     * Key-value pairs of regular variables that must be used to execute the OpenTofu request.
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
    public void setVariables(@jakarta.annotation.Nonnull Map<String, Object> variables) {
        this.variables = variables;
    }

    public OpenTofuAsyncDestroyFromGitRepoRequest envVariables(
            @jakarta.annotation.Nullable Map<String, String> envVariables) {

        this.envVariables = envVariables;
        return this;
    }

    public OpenTofuAsyncDestroyFromGitRepoRequest putEnvVariablesItem(
            String key, String envVariablesItem) {
        if (this.envVariables == null) {
            this.envVariables = new HashMap<>();
        }
        this.envVariables.put(key, envVariablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be injected as environment variables to OpenTofu
     * process.
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
    public void setEnvVariables(@jakarta.annotation.Nullable Map<String, String> envVariables) {
        this.envVariables = envVariables;
    }

    public OpenTofuAsyncDestroyFromGitRepoRequest gitRepoDetails(
            @jakarta.annotation.Nullable OpenTofuScriptGitRepoDetails gitRepoDetails) {

        this.gitRepoDetails = gitRepoDetails;
        return this;
    }

    /**
     * Get gitRepoDetails
     *
     * @return gitRepoDetails
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_GIT_REPO_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OpenTofuScriptGitRepoDetails getGitRepoDetails() {
        return gitRepoDetails;
    }

    @JsonProperty(JSON_PROPERTY_GIT_REPO_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGitRepoDetails(
            @jakarta.annotation.Nullable OpenTofuScriptGitRepoDetails gitRepoDetails) {
        this.gitRepoDetails = gitRepoDetails;
    }

    public OpenTofuAsyncDestroyFromGitRepoRequest tfState(
            @jakarta.annotation.Nonnull String tfState) {

        this.tfState = tfState;
        return this;
    }

    /**
     * The .tfState file content after deployment
     *
     * @return tfState
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TF_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTfState() {
        return tfState;
    }

    @JsonProperty(JSON_PROPERTY_TF_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTfState(@jakarta.annotation.Nonnull String tfState) {
        this.tfState = tfState;
    }

    public OpenTofuAsyncDestroyFromGitRepoRequest webhookConfig(
            @jakarta.annotation.Nonnull WebhookConfig webhookConfig) {

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
    public void setWebhookConfig(@jakarta.annotation.Nonnull WebhookConfig webhookConfig) {
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
        OpenTofuAsyncDestroyFromGitRepoRequest openTofuAsyncDestroyFromGitRepoRequest =
                (OpenTofuAsyncDestroyFromGitRepoRequest) o;
        return Objects.equals(this.requestId, openTofuAsyncDestroyFromGitRepoRequest.requestId)
                && Objects.equals(
                        this.openTofuVersion,
                        openTofuAsyncDestroyFromGitRepoRequest.openTofuVersion)
                && Objects.equals(this.variables, openTofuAsyncDestroyFromGitRepoRequest.variables)
                && Objects.equals(
                        this.envVariables, openTofuAsyncDestroyFromGitRepoRequest.envVariables)
                && Objects.equals(
                        this.gitRepoDetails, openTofuAsyncDestroyFromGitRepoRequest.gitRepoDetails)
                && Objects.equals(this.tfState, openTofuAsyncDestroyFromGitRepoRequest.tfState)
                && Objects.equals(
                        this.webhookConfig, openTofuAsyncDestroyFromGitRepoRequest.webhookConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                requestId,
                openTofuVersion,
                variables,
                envVariables,
                gitRepoDetails,
                tfState,
                webhookConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenTofuAsyncDestroyFromGitRepoRequest {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    openTofuVersion: ").append(toIndentedString(openTofuVersion)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
        sb.append("    gitRepoDetails: ").append(toIndentedString(gitRepoDetails)).append("\n");
        sb.append("    tfState: ").append(toIndentedString(tfState)).append("\n");
        sb.append("    webhookConfig: ").append(toIndentedString(webhookConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

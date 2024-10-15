/*
 * Tofu-Maker API
 * RESTful Services to interact with Tofu-Maker runtime
 *
 * The version of the OpenAPI document: 1.0.7-SNAPSHOT
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
 * OpenTofuPlanFromDirectoryRequest
 */
@JsonPropertyOrder({
        OpenTofuPlanFromDirectoryRequest.JSON_PROPERTY_REQUEST_ID,
        OpenTofuPlanFromDirectoryRequest.JSON_PROPERTY_OPEN_TOFU_VERSION,
        OpenTofuPlanFromDirectoryRequest.JSON_PROPERTY_VARIABLES,
        OpenTofuPlanFromDirectoryRequest.JSON_PROPERTY_ENV_VARIABLES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class OpenTofuPlanFromDirectoryRequest {
    public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
    public static final String JSON_PROPERTY_OPEN_TOFU_VERSION = "openTofuVersion";
    public static final String JSON_PROPERTY_VARIABLES = "variables";
    public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
    private UUID requestId;
    private String openTofuVersion;
    private Map<String, Object> variables = new HashMap<>();
    private Map<String, String> envVariables = new HashMap<>();

    public OpenTofuPlanFromDirectoryRequest() {
    }

    public OpenTofuPlanFromDirectoryRequest requestId(UUID requestId) {

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

    public OpenTofuPlanFromDirectoryRequest openTofuVersion(String openTofuVersion) {

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

    public OpenTofuPlanFromDirectoryRequest variables(Map<String, Object> variables) {

        this.variables = variables;
        return this;
    }

    public OpenTofuPlanFromDirectoryRequest putVariablesItem(String key, Object variablesItem) {
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

    public OpenTofuPlanFromDirectoryRequest envVariables(Map<String, String> envVariables) {

        this.envVariables = envVariables;
        return this;
    }

    public OpenTofuPlanFromDirectoryRequest putEnvVariablesItem(String key,
                                                                String envVariablesItem) {
        if (this.envVariables == null) {
            this.envVariables = new HashMap<>();
        }
        this.envVariables.put(key, envVariablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be injected as environment variables to open tofu process.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenTofuPlanFromDirectoryRequest openTofuPlanFromDirectoryRequest =
                (OpenTofuPlanFromDirectoryRequest) o;
        return Objects.equals(this.requestId, openTofuPlanFromDirectoryRequest.requestId) &&
                Objects.equals(this.openTofuVersion,
                        openTofuPlanFromDirectoryRequest.openTofuVersion) &&
                Objects.equals(this.variables, openTofuPlanFromDirectoryRequest.variables) &&
                Objects.equals(this.envVariables, openTofuPlanFromDirectoryRequest.envVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, openTofuVersion, variables, envVariables);
    }

    @Override
    public String toString() {
        String sb = "class OpenTofuPlanFromDirectoryRequest {\n"
                + "    requestId: " + toIndentedString(requestId) + "\n"
                + "    openTofuVersion: " + toIndentedString(openTofuVersion) + "\n"
                + "    variables: " + toIndentedString(variables) + "\n"
                + "    envVariables: " + toIndentedString(envVariables) + "\n"
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


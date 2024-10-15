/*
 * Terraform-Boot API
 * RESTful Services to interact with Terraform-Boot runtime
 *
 * The version of the OpenAPI document: 1.0.12-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * TerraformDeployFromDirectoryRequest
 */
@JsonPropertyOrder({
        TerraformDeployFromDirectoryRequest.JSON_PROPERTY_REQUEST_ID,
        TerraformDeployFromDirectoryRequest.JSON_PROPERTY_TERRAFORM_VERSION,
        TerraformDeployFromDirectoryRequest.JSON_PROPERTY_IS_PLAN_ONLY,
        TerraformDeployFromDirectoryRequest.JSON_PROPERTY_VARIABLES,
        TerraformDeployFromDirectoryRequest.JSON_PROPERTY_ENV_VARIABLES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TerraformDeployFromDirectoryRequest {
    public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
    public static final String JSON_PROPERTY_TERRAFORM_VERSION = "terraformVersion";
    public static final String JSON_PROPERTY_IS_PLAN_ONLY = "isPlanOnly";
    public static final String JSON_PROPERTY_VARIABLES = "variables";
    public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
    private UUID requestId;
    private String terraformVersion;
    private Boolean isPlanOnly;
    private Map<String, Object> variables = new HashMap<>();
    private Map<String, String> envVariables = new HashMap<>();

    public TerraformDeployFromDirectoryRequest() {
    }

    public TerraformDeployFromDirectoryRequest requestId(UUID requestId) {

        this.requestId = requestId;
        return this;
    }

    /**
     * Id of the request
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

    public TerraformDeployFromDirectoryRequest terraformVersion(String terraformVersion) {

        this.terraformVersion = terraformVersion;
        return this;
    }

    /**
     * The required version of the terraform which will execute the scripts.
     *
     * @return terraformVersion
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TERRAFORM_VERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getTerraformVersion() {
        return terraformVersion;
    }


    @JsonProperty(JSON_PROPERTY_TERRAFORM_VERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTerraformVersion(String terraformVersion) {
        this.terraformVersion = terraformVersion;
    }

    public TerraformDeployFromDirectoryRequest isPlanOnly(Boolean isPlanOnly) {

        this.isPlanOnly = isPlanOnly;
        return this;
    }

    /**
     * Flag to control if the deployment must only generate the terraform or it must also apply the changes.
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

    public TerraformDeployFromDirectoryRequest variables(Map<String, Object> variables) {

        this.variables = variables;
        return this;
    }

    public TerraformDeployFromDirectoryRequest putVariablesItem(String key, Object variablesItem) {
        this.variables.put(key, variablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be used to execute the Terraform request.
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

    public TerraformDeployFromDirectoryRequest envVariables(Map<String, String> envVariables) {

        this.envVariables = envVariables;
        return this;
    }

    public TerraformDeployFromDirectoryRequest putEnvVariablesItem(String key,
                                                                   String envVariablesItem) {
        if (this.envVariables == null) {
            this.envVariables = new HashMap<>();
        }
        this.envVariables.put(key, envVariablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be injected as environment variables to terraform process.
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
        TerraformDeployFromDirectoryRequest terraformDeployFromDirectoryRequest =
                (TerraformDeployFromDirectoryRequest) o;
        return Objects.equals(this.requestId, terraformDeployFromDirectoryRequest.requestId) &&
                Objects.equals(this.terraformVersion,
                        terraformDeployFromDirectoryRequest.terraformVersion) &&
                Objects.equals(this.isPlanOnly, terraformDeployFromDirectoryRequest.isPlanOnly) &&
                Objects.equals(this.variables, terraformDeployFromDirectoryRequest.variables) &&
                Objects.equals(this.envVariables, terraformDeployFromDirectoryRequest.envVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, terraformVersion, isPlanOnly, variables, envVariables);
    }

    @Override
    public String toString() {
        String sb = "class TerraformDeployFromDirectoryRequest {\n"
                + "    requestId: " + toIndentedString(requestId) + "\n"
                + "    terraformVersion: " + toIndentedString(terraformVersion) + "\n"
                + "    isPlanOnly: " + toIndentedString(isPlanOnly) + "\n"
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


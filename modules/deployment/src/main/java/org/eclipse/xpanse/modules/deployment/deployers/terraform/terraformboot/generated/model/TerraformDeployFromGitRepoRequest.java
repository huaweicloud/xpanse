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
 * TerraformDeployFromGitRepoRequest
 */
@JsonPropertyOrder({
        TerraformDeployFromGitRepoRequest.JSON_PROPERTY_REQUEST_ID,
        TerraformDeployFromGitRepoRequest.JSON_PROPERTY_TERRAFORM_VERSION,
        TerraformDeployFromGitRepoRequest.JSON_PROPERTY_IS_PLAN_ONLY,
        TerraformDeployFromGitRepoRequest.JSON_PROPERTY_VARIABLES,
        TerraformDeployFromGitRepoRequest.JSON_PROPERTY_ENV_VARIABLES,
        TerraformDeployFromGitRepoRequest.JSON_PROPERTY_GIT_REPO_DETAILS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class TerraformDeployFromGitRepoRequest {
    public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
    public static final String JSON_PROPERTY_TERRAFORM_VERSION = "terraformVersion";
    public static final String JSON_PROPERTY_IS_PLAN_ONLY = "isPlanOnly";
    public static final String JSON_PROPERTY_VARIABLES = "variables";
    public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
    public static final String JSON_PROPERTY_GIT_REPO_DETAILS = "gitRepoDetails";
    private UUID requestId;
    private String terraformVersion;
    private Boolean isPlanOnly;
    private Map<String, Object> variables = new HashMap<>();
    private Map<String, String> envVariables = new HashMap<>();
    private TerraformScriptGitRepoDetails gitRepoDetails;

    public TerraformDeployFromGitRepoRequest() {
    }

    public TerraformDeployFromGitRepoRequest requestId(UUID requestId) {

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

    public TerraformDeployFromGitRepoRequest terraformVersion(String terraformVersion) {

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

    public TerraformDeployFromGitRepoRequest isPlanOnly(Boolean isPlanOnly) {

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

    public TerraformDeployFromGitRepoRequest variables(Map<String, Object> variables) {

        this.variables = variables;
        return this;
    }

    public TerraformDeployFromGitRepoRequest putVariablesItem(String key, Object variablesItem) {
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

    public TerraformDeployFromGitRepoRequest envVariables(Map<String, String> envVariables) {

        this.envVariables = envVariables;
        return this;
    }

    public TerraformDeployFromGitRepoRequest putEnvVariablesItem(String key,
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

    public TerraformDeployFromGitRepoRequest gitRepoDetails(
            TerraformScriptGitRepoDetails gitRepoDetails) {

        this.gitRepoDetails = gitRepoDetails;
        return this;
    }

    /**
     * Get gitRepoDetails
     *
     * @return gitRepoDetails
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_GIT_REPO_DETAILS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public TerraformScriptGitRepoDetails getGitRepoDetails() {
        return gitRepoDetails;
    }


    @JsonProperty(JSON_PROPERTY_GIT_REPO_DETAILS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setGitRepoDetails(TerraformScriptGitRepoDetails gitRepoDetails) {
        this.gitRepoDetails = gitRepoDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TerraformDeployFromGitRepoRequest terraformDeployFromGitRepoRequest =
                (TerraformDeployFromGitRepoRequest) o;
        return Objects.equals(this.requestId, terraformDeployFromGitRepoRequest.requestId) &&
                Objects.equals(this.terraformVersion,
                        terraformDeployFromGitRepoRequest.terraformVersion) &&
                Objects.equals(this.isPlanOnly, terraformDeployFromGitRepoRequest.isPlanOnly) &&
                Objects.equals(this.variables, terraformDeployFromGitRepoRequest.variables) &&
                Objects.equals(this.envVariables, terraformDeployFromGitRepoRequest.envVariables) &&
                Objects.equals(this.gitRepoDetails,
                        terraformDeployFromGitRepoRequest.gitRepoDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, terraformVersion, isPlanOnly, variables, envVariables,
                gitRepoDetails);
    }

    @Override
    public String toString() {
        String sb = "class TerraformDeployFromGitRepoRequest {\n"
                + "    requestId: " + toIndentedString(requestId) + "\n"
                + "    terraformVersion: " + toIndentedString(terraformVersion) + "\n"
                + "    isPlanOnly: " + toIndentedString(isPlanOnly) + "\n"
                + "    variables: " + toIndentedString(variables) + "\n"
                + "    envVariables: " + toIndentedString(envVariables) + "\n"
                + "    gitRepoDetails: " + toIndentedString(gitRepoDetails) + "\n"
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


/*
 * Terra-Boot API
 * RESTful Services to interact with terraform CLI
 *
 * The version of the OpenAPI document: 1.0.20-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.eclipse.xpanse.modules.deployment.deployers.terraform.terraboot.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** TerraformDestroyFromDirectoryRequest */
@JsonPropertyOrder({
    TerraformDestroyFromDirectoryRequest.JSON_PROPERTY_REQUEST_ID,
    TerraformDestroyFromDirectoryRequest.JSON_PROPERTY_TERRAFORM_VERSION,
    TerraformDestroyFromDirectoryRequest.JSON_PROPERTY_VARIABLES,
    TerraformDestroyFromDirectoryRequest.JSON_PROPERTY_ENV_VARIABLES
})
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.11.0")
public class TerraformDestroyFromDirectoryRequest {
    public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
    @jakarta.annotation.Nullable private UUID requestId;

    public static final String JSON_PROPERTY_TERRAFORM_VERSION = "terraformVersion";
    @jakarta.annotation.Nonnull private String terraformVersion;

    public static final String JSON_PROPERTY_VARIABLES = "variables";
    @jakarta.annotation.Nonnull private Map<String, String> variables = new HashMap<>();

    public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
    @jakarta.annotation.Nullable private Map<String, String> envVariables = new HashMap<>();

    public TerraformDestroyFromDirectoryRequest() {}

    public TerraformDestroyFromDirectoryRequest requestId(
            @jakarta.annotation.Nullable UUID requestId) {

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
    public void setRequestId(@jakarta.annotation.Nullable UUID requestId) {
        this.requestId = requestId;
    }

    public TerraformDestroyFromDirectoryRequest terraformVersion(
            @jakarta.annotation.Nonnull String terraformVersion) {

        this.terraformVersion = terraformVersion;
        return this;
    }

    /**
     * The required version of terraform which will execute the scripts.
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
    public void setTerraformVersion(@jakarta.annotation.Nonnull String terraformVersion) {
        this.terraformVersion = terraformVersion;
    }

    public TerraformDestroyFromDirectoryRequest variables(
            @jakarta.annotation.Nonnull Map<String, String> variables) {

        this.variables = variables;
        return this;
    }

    public TerraformDestroyFromDirectoryRequest putVariablesItem(String key, String variablesItem) {
        this.variables.put(key, variablesItem);
        return this;
    }

    /**
     * Key-value pairs of regular variables that must be used to execute the Terraform request.
     *
     * @return variables
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Map<String, String> getVariables() {
        return variables;
    }

    @JsonProperty(JSON_PROPERTY_VARIABLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVariables(@jakarta.annotation.Nonnull Map<String, String> variables) {
        this.variables = variables;
    }

    public TerraformDestroyFromDirectoryRequest envVariables(
            @jakarta.annotation.Nullable Map<String, String> envVariables) {

        this.envVariables = envVariables;
        return this;
    }

    public TerraformDestroyFromDirectoryRequest putEnvVariablesItem(
            String key, String envVariablesItem) {
        if (this.envVariables == null) {
            this.envVariables = new HashMap<>();
        }
        this.envVariables.put(key, envVariablesItem);
        return this;
    }

    /**
     * Key-value pairs of variables that must be injected as environment variables to terraform
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TerraformDestroyFromDirectoryRequest terraformDestroyFromDirectoryRequest =
                (TerraformDestroyFromDirectoryRequest) o;
        return Objects.equals(this.requestId, terraformDestroyFromDirectoryRequest.requestId)
                && Objects.equals(
                        this.terraformVersion,
                        terraformDestroyFromDirectoryRequest.terraformVersion)
                && Objects.equals(this.variables, terraformDestroyFromDirectoryRequest.variables)
                && Objects.equals(
                        this.envVariables, terraformDestroyFromDirectoryRequest.envVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, terraformVersion, variables, envVariables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerraformDestroyFromDirectoryRequest {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    terraformVersion: ").append(toIndentedString(terraformVersion)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
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

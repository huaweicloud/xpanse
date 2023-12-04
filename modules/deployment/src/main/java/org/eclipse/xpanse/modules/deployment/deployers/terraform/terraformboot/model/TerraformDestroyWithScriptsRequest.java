/*
 * Terraform-Boot API
 * RESTful Services to interact with Terraform-Boot runtime
 *
 * The version of the OpenAPI document: 1.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.eclipse.xpanse.modules.deployment.deployers.terraform.terraformboot.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TerraformDestroyWithScriptsRequest
 */
@JsonPropertyOrder({
  TerraformDestroyWithScriptsRequest.JSON_PROPERTY_VARIABLES,
  TerraformDestroyWithScriptsRequest.JSON_PROPERTY_ENV_VARIABLES,
  TerraformDestroyWithScriptsRequest.JSON_PROPERTY_SCRIPTS,
  TerraformDestroyWithScriptsRequest.JSON_PROPERTY_TF_STATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TerraformDestroyWithScriptsRequest {
  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private Map<String, Object> variables = new HashMap<>();

  public static final String JSON_PROPERTY_ENV_VARIABLES = "envVariables";
  private Map<String, String> envVariables = new HashMap<>();

  public static final String JSON_PROPERTY_SCRIPTS = "scripts";
  private List<String> scripts = new ArrayList<>();

  public static final String JSON_PROPERTY_TF_STATE = "tfState";
  private String tfState;

  public TerraformDestroyWithScriptsRequest() {
  }

  public TerraformDestroyWithScriptsRequest variables(Map<String, Object> variables) {
    
    this.variables = variables;
    return this;
  }

  public TerraformDestroyWithScriptsRequest putVariablesItem(String key, Object variablesItem) {
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Key-value pairs of regular variables that must be used to execute the Terraform request.
   * @return variables
  **/
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


  public TerraformDestroyWithScriptsRequest envVariables(Map<String, String> envVariables) {
    
    this.envVariables = envVariables;
    return this;
  }

  public TerraformDestroyWithScriptsRequest putEnvVariablesItem(String key, String envVariablesItem) {
    if (this.envVariables == null) {
      this.envVariables = new HashMap<>();
    }
    this.envVariables.put(key, envVariablesItem);
    return this;
  }

   /**
   * Key-value pairs of variables that must be injected as environment variables to terraform process.
   * @return envVariables
  **/
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


  public TerraformDestroyWithScriptsRequest scripts(List<String> scripts) {
    
    this.scripts = scripts;
    return this;
  }

  public TerraformDestroyWithScriptsRequest addScriptsItem(String scriptsItem) {
    if (this.scripts == null) {
      this.scripts = new ArrayList<>();
    }
    this.scripts.add(scriptsItem);
    return this;
  }

   /**
   * List of script files for destroy requests deployed via scripts
   * @return scripts
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCRIPTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getScripts() {
    return scripts;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScripts(List<String> scripts) {
    this.scripts = scripts;
  }


  public TerraformDestroyWithScriptsRequest tfState(String tfState) {
    
    this.tfState = tfState;
    return this;
  }

   /**
   * The .tfState file content after deployment
   * @return tfState
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TF_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTfState() {
    return tfState;
  }


  @JsonProperty(JSON_PROPERTY_TF_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTfState(String tfState) {
    this.tfState = tfState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerraformDestroyWithScriptsRequest terraformDestroyWithScriptsRequest = (TerraformDestroyWithScriptsRequest) o;
    return Objects.equals(this.variables, terraformDestroyWithScriptsRequest.variables) &&
        Objects.equals(this.envVariables, terraformDestroyWithScriptsRequest.envVariables) &&
        Objects.equals(this.scripts, terraformDestroyWithScriptsRequest.scripts) &&
        Objects.equals(this.tfState, terraformDestroyWithScriptsRequest.tfState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, envVariables, scripts, tfState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerraformDestroyWithScriptsRequest {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    envVariables: ").append(toIndentedString(envVariables)).append("\n");
    sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
    sb.append("    tfState: ").append(toIndentedString(tfState)).append("\n");
    sb.append("}");
    return sb.toString();
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


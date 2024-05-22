/*
 * Tofu-Maker API
 * RESTful Services to interact with Tofu-Maker runtime
 *
 * The version of the OpenAPI document: 1.0.2-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.eclipse.xpanse.modules.deployment.deployers.opentofu.tofumaker.generated.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GIT Repo details from where the scripts can be fetched.
 */
@JsonPropertyOrder({
  OpenTofuScriptGitRepoDetails.JSON_PROPERTY_REPO_URL,
  OpenTofuScriptGitRepoDetails.JSON_PROPERTY_BRANCH,
  OpenTofuScriptGitRepoDetails.JSON_PROPERTY_SCRIPT_PATH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class OpenTofuScriptGitRepoDetails {
  public static final String JSON_PROPERTY_REPO_URL = "repoUrl";
  private String repoUrl;

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private String branch;

  public static final String JSON_PROPERTY_SCRIPT_PATH = "scriptPath";
  private String scriptPath;

  public OpenTofuScriptGitRepoDetails() {
  }

  public OpenTofuScriptGitRepoDetails repoUrl(String repoUrl) {
    
    this.repoUrl = repoUrl;
    return this;
  }

   /**
   * url of the GIT repo. This repo will be cloned.
   * @return repoUrl
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPO_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRepoUrl() {
    return repoUrl;
  }


  @JsonProperty(JSON_PROPERTY_REPO_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepoUrl(String repoUrl) {
    this.repoUrl = repoUrl;
  }


  public OpenTofuScriptGitRepoDetails branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * Branch to be checked-out after the repo is cloned.
   * @return branch
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBranch() {
    return branch;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBranch(String branch) {
    this.branch = branch;
  }


  public OpenTofuScriptGitRepoDetails scriptPath(String scriptPath) {
    
    this.scriptPath = scriptPath;
    return this;
  }

   /**
   * Location of the scripts. If not provided, the scripts will be executed from root folder of the repo.
   * @return scriptPath
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCRIPT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScriptPath() {
    return scriptPath;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScriptPath(String scriptPath) {
    this.scriptPath = scriptPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenTofuScriptGitRepoDetails openTofuScriptGitRepoDetails = (OpenTofuScriptGitRepoDetails) o;
    return Objects.equals(this.repoUrl, openTofuScriptGitRepoDetails.repoUrl) &&
        Objects.equals(this.branch, openTofuScriptGitRepoDetails.branch) &&
        Objects.equals(this.scriptPath, openTofuScriptGitRepoDetails.scriptPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoUrl, branch, scriptPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenTofuScriptGitRepoDetails {\n");
    sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    scriptPath: ").append(toIndentedString(scriptPath)).append("\n");
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


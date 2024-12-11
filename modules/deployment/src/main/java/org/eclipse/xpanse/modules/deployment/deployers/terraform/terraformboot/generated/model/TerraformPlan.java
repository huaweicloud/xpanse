/*
 * Terraform-Boot API
 * RESTful Services to interact with Terraform-Boot runtime
 *
 * The version of the OpenAPI document: 1.0.15-SNAPSHOT
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
import java.util.Objects;

/** TerraformPlan */
@JsonPropertyOrder({
    TerraformPlan.JSON_PROPERTY_PLAN,
    TerraformPlan.JSON_PROPERTY_TERRAFORM_VERSION_USED
})
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator " + "version: 7.10.0")
public class TerraformPlan {
    public static final String JSON_PROPERTY_PLAN = "plan";
    @jakarta.annotation.Nonnull private String plan;

    public static final String JSON_PROPERTY_TERRAFORM_VERSION_USED = "terraformVersionUsed";
    @jakarta.annotation.Nullable private String terraformVersionUsed;

    public TerraformPlan() {}

    public TerraformPlan plan(@jakarta.annotation.Nonnull String plan) {

        this.plan = plan;
        return this;
    }

    /**
     * Terraform plan as a JSON string
     *
     * @return plan
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PLAN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPlan() {
        return plan;
    }

    @JsonProperty(JSON_PROPERTY_PLAN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPlan(@jakarta.annotation.Nonnull String plan) {
        this.plan = plan;
    }

    public TerraformPlan terraformVersionUsed(
            @jakarta.annotation.Nullable String terraformVersionUsed) {

        this.terraformVersionUsed = terraformVersionUsed;
        return this;
    }

    /**
     * The version of the Terraform binary used to execute scripts.
     *
     * @return terraformVersionUsed
     */
    @jakarta.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TERRAFORM_VERSION_USED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTerraformVersionUsed() {
        return terraformVersionUsed;
    }

    @JsonProperty(JSON_PROPERTY_TERRAFORM_VERSION_USED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTerraformVersionUsed(@jakarta.annotation.Nullable String terraformVersionUsed) {
        this.terraformVersionUsed = terraformVersionUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TerraformPlan terraformPlan = (TerraformPlan) o;
        return Objects.equals(this.plan, terraformPlan.plan)
                && Objects.equals(this.terraformVersionUsed, terraformPlan.terraformVersionUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plan, terraformVersionUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerraformPlan {\n");
        sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
        sb.append("    terraformVersionUsed: ")
                .append(toIndentedString(terraformVersionUsed))
                .append("\n");
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

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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Response
 */
@JsonPropertyOrder({
        Response.JSON_PROPERTY_RESULT_TYPE,
        Response.JSON_PROPERTY_DETAILS,
        Response.JSON_PROPERTY_SUCCESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class Response {
    public static final String JSON_PROPERTY_RESULT_TYPE = "resultType";
    public static final String JSON_PROPERTY_DETAILS = "details";
    public static final String JSON_PROPERTY_SUCCESS = "success";
    private ResultTypeEnum resultType;
    private List<String> details = new ArrayList<>();
    private Boolean success;
    public Response() {
    }

    public Response resultType(ResultTypeEnum resultType) {

        this.resultType = resultType;
        return this;
    }

    /**
     * The result code of response.
     *
     * @return resultType
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_RESULT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public ResultTypeEnum getResultType() {
        return resultType;
    }

    @JsonProperty(JSON_PROPERTY_RESULT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setResultType(ResultTypeEnum resultType) {
        this.resultType = resultType;
    }

    public Response details(List<String> details) {

        this.details = details;
        return this;
    }

    public Response addDetailsItem(String detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    /**
     * Details of the errors occurred
     *
     * @return details
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DETAILS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public List<String> getDetails() {
        return details;
    }

    @JsonProperty(JSON_PROPERTY_DETAILS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDetails(List<String> details) {
        this.details = details;
    }

    public Response success(Boolean success) {

        this.success = success;
        return this;
    }

    /**
     * Describes if the request is successful
     *
     * @return success
     */
    @jakarta.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SUCCESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty(JSON_PROPERTY_SUCCESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Response response = (Response) o;
        return Objects.equals(this.resultType, response.resultType) &&
                Objects.equals(this.details, response.details) &&
                Objects.equals(this.success, response.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultType, details, success);
    }

    @Override
    public String toString() {
        String sb = "class Response {\n"
                + "    resultType: " + toIndentedString(resultType) + "\n"
                + "    details: " + toIndentedString(details) + "\n"
                + "    success: " + toIndentedString(success) + "\n"
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

    /**
     * The result code of response.
     */
    public enum ResultTypeEnum {
        PARAMETERS_INVALID("Parameters Invalid"),

        UNPROCESSABLE_ENTITY("Unprocessable Entity"),

        OPEN_TOFU_EXECUTION_FAILED("OpenTofu Execution Failed"),

        INVALID_OPEN_TOFU_TOOL("Invalid OpenTofu Tool"),

        UNSUPPORTED_ENUM_VALUE("Unsupported Enum Value"),

        SERVICE_UNAVAILABLE("Service Unavailable"),

        UNAUTHORIZED("Unauthorized"),

        INVALID_GIT_REPO_DETAILS("Invalid Git Repo Details");

        private final String value;

        ResultTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ResultTypeEnum fromValue(String value) {
            for (ResultTypeEnum b : ResultTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}


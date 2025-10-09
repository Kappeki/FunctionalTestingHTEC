package data.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorResponse implements Serializable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("traceId")
    @Expose
    private String traceId;
    @SerializedName("errors")
    @Expose
    private Errors errors;
//    private final static long serialVersionUID = -8621426946909605631L;

    public ErrorResponse() {
    }

    public ErrorResponse(String type, String title, Integer status, String traceId, Errors errors) {
        super();
        this.type = type;
        this.title = title;
        this.status = status;
        this.traceId = traceId;
        this.errors = errors;
    }

    public ErrorResponse(String type, String title, Integer status, String traceId) {
        super();
        this.type = type;
        this.title = title;
        this.status = status;
        this.traceId = traceId;
        this.errors = null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

}
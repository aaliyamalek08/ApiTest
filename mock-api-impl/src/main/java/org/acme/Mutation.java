package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Mutation {

    @JsonProperty("Version")
    private int version;

    @JsonProperty("TrackingNo")
    private String trackingNo;

    @JsonProperty("Method")
    private String method;

    @JsonProperty("Args")
    private Args args;

    @JsonProperty("Fields")
    private List<String> fields;

    // Getters and setters
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Args getArgs() {
        return args;
    }

    public void setArgs(Args args) {
        this.args = args;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }
}

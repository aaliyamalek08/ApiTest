package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TranInfo {

    @JsonProperty("description")
    private String description;

    @JsonProperty("referenceNo")
    private String referenceNo;

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
}

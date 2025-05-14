package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TranAcct {

    @JsonProperty("acctNo")
    private String acctNo;

    // Getter and setter
    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }
}

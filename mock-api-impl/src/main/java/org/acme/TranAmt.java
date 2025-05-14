package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TranAmt {

    @JsonProperty("amount")
    private String amount;

    // Getter and setter
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}


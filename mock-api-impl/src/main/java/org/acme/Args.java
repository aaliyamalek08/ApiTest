package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Args {

    @JsonProperty("DebitCredit")
    private int debitCredit;

    @JsonProperty("TranInfo")
    private TranInfo tranInfo;

    @JsonProperty("TranAcct")
    private TranAcct tranAcct;

    @JsonProperty("TranAmt")
    private TranAmt tranAmt;

    @JsonProperty("OffsetAcct")
    private OffsetAcct offsetAcct;

    // Getters and setters
    public int getDebitCredit() {
        return debitCredit;
    }

    public void setDebitCredit(int debitCredit) {
        this.debitCredit = debitCredit;
    }

    public TranInfo getTranInfo() {
        return tranInfo;
    }

    public void setTranInfo(TranInfo tranInfo) {
        this.tranInfo = tranInfo;
    }

    public TranAcct getTranAcct() {
        return tranAcct;
    }

    public void setTranAcct(TranAcct tranAcct) {
        this.tranAcct = tranAcct;
    }

    public TranAmt getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(TranAmt tranAmt) {
        this.tranAmt = tranAmt;
    }

    public OffsetAcct getOffsetAcct() {
        return offsetAcct;
    }

    public void setOffsetAcct(OffsetAcct offsetAcct) {
        this.offsetAcct = offsetAcct;
    }
}

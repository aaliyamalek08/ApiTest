package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    private String swiftMsgID;
    private String dealID;
    private String someField;

    public String getSomeField(){
        return someField;
    }

    public void setSomeField(String someField){
        this.someField = someField;
    }

    @Override
    public String toString() {
        return "Message{" +
                "someField='" + someField + '\'' +
                '}';
    }

        @JsonProperty("transactionDate")
        private String transactionDate;

        @JsonProperty("bobcusReference")
        private String bobcusReference;

        @JsonProperty("receivingBank")
        private String receivingBank;

        @JsonProperty("receivingCountry")
        private String receivingCountry;

        @JsonProperty("non_ResAccountName")
        private String non_ResAccountName;

        @JsonProperty("non_ResAccountNumber")
        private String non_ResAccountNumber;

        @JsonProperty("non_ResResidentialAddress")
        private String non_ResResidentialAddress;

        @JsonProperty("non_ResCity")
        private String non_ResCity;

        @JsonProperty("non_ResCountry")
        private String non_ResCountry;

        @JsonProperty("residentAccountNumber")
        private String residentAccountNumber;

        @JsonProperty("transactionFlowBuy")
        private String transactionFlowBuy;

        @JsonProperty("rim")
        private String rim;

        @JsonProperty("spotRates")
        private double spotRates;

        @JsonProperty("dealRates")
        private double dealRates;

        @JsonProperty("shortName")
        private String shortName;

        @JsonProperty("settlementMode")
        private String settlementMode;

        @JsonProperty("defaultFlag")
        private boolean defaultFlag;

        @JsonProperty("agentName")
        private String agentName;

        @JsonProperty("agentBicCode")
        private String agentBicCode;

        @JsonProperty("agentAccountNumber")
        private String agentAccountNumber;

        @JsonProperty("intermediaryName")
        private String intermediaryName;

        @JsonProperty("intermediaryBicCode")
        private String intermediaryBicCode;

        @JsonProperty("charge")
        private String charge;

        @JsonProperty("c32A_Currency")
        private String c32A_Currency;

        @JsonProperty("field72")
        private String field72;

        @JsonProperty("transactionReference")
        private String transactionReference;

        @JsonProperty("nostroShortName")
        private String nostroShortName;

        @JsonProperty("c32A_ValueDate")
        private String c32A_ValueDate;

        @JsonProperty("c32A_Amount")
        private int c32A_Amount;

        @JsonProperty("externalID")
        private String externalID;

        @JsonProperty("spotDeal")
        private boolean spotDeal;

        @JsonProperty("product")
        private String product;

        @JsonProperty("additionalInfo")
        private String additionalInfo;

        @JsonProperty("currencyType")
        private String currencyType;

        @JsonProperty("residentAccountCurrency")
        private String residentAccountCurrency;


        // Getters and Setters

        public String getTransactionDate() {
            return transactionDate;
        }

        public void setTransactionDate(String transactionDate) {
            this.transactionDate = transactionDate;
        }

        public String getBobcusReference() {
            return bobcusReference;
        }

        public void setBobcusReference(String bobcusReference) {
            this.bobcusReference = bobcusReference;
        }

        public String getReceivingBank() {
            return receivingBank;
        }

        public void setReceivingBank(String receivingBank) {
            this.receivingBank = receivingBank;
        }

        public String getReceivingCountry() {
            return receivingCountry;
        }

        public void setReceivingCountry(String receivingCountry) {
            this.receivingCountry = receivingCountry;
        }

        public String getNon_ResAccountName() {
            return non_ResAccountName;
        }

        public void setNon_ResAccountName(String non_ResAccountName) {
            this.non_ResAccountName = non_ResAccountName;
        }

        public String getNon_ResAccountNumber() {
            return non_ResAccountNumber;
        }

        public void setNon_ResAccountNumber(String non_ResAccountNumber) {
            this.non_ResAccountNumber = non_ResAccountNumber;
        }

        public String getNon_ResResidentialAddress() {
            return non_ResResidentialAddress;
        }

        public void setNon_ResResidentialAddress(String non_ResResidentialAddress) {
            this.non_ResResidentialAddress = non_ResResidentialAddress;
        }

        public String getNon_ResCity() {
            return non_ResCity;
        }

        public void setNon_ResCity(String non_ResCity) {
            this.non_ResCity = non_ResCity;
        }

        public String getNon_ResCountry() {
            return non_ResCountry;
        }

        public void setNon_ResCountry(String non_ResCountry) {
            this.non_ResCountry = non_ResCountry;
        }

        public String getResidentAccountNumber() {
            return residentAccountNumber;
        }

        public void setResidentAccountNumber(String residentAccountNumber) {
            this.residentAccountNumber = residentAccountNumber;
        }

        public String getTransactionFlowBuy() {
            return transactionFlowBuy;
        }

        public void setTransactionFlowBuy(String transactionFlowBuy) {
            this.transactionFlowBuy = transactionFlowBuy;
        }

        public String getRim() {
            return rim;
        }

        public void setRim(String rim) {
            this.rim = rim;
        }

        public double getSpotRates() {
            return spotRates;
        }

        public void setSpotRates(double spotRates) {
            this.spotRates = spotRates;
        }

        public double getDealRates() {
            return dealRates;
        }

        public void setDealRates(double dealRates) {
            this.dealRates = dealRates;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getSettlementMode() {
            return settlementMode;
        }

        public void setSettlementMode(String settlementMode) {
            this.settlementMode = settlementMode;
        }

        public boolean isDefaultFlag() {
            return defaultFlag;
        }

        public void setDefaultFlag(boolean defaultFlag) {
            this.defaultFlag = defaultFlag;
        }

        public String getAgentName() {
            return agentName;
        }

        public void setAgentName(String agentName) {
            this.agentName = agentName;
        }

        public String getAgentBicCode() {
            return agentBicCode;
        }

        public void setAgentBicCode(String agentBicCode) {
            this.agentBicCode = agentBicCode;
        }

        public String getAgentAccountNumber() {
            return agentAccountNumber;
        }

        public void setAgentAccountNumber(String agentAccountNumber) {
            this.agentAccountNumber = agentAccountNumber;
        }

        public String getIntermediaryName() {
            return intermediaryName;
        }

        public void setIntermediaryName(String intermediaryName) {
            this.intermediaryName = intermediaryName;
        }

        public String getIntermediaryBicCode() {
            return intermediaryBicCode;
        }

        public void setIntermediaryBicCode(String intermediaryBicCode) {
            this.intermediaryBicCode = intermediaryBicCode;
        }

        public String getCharge() {
            return charge;
        }

        public void setCharge(String charge) {
            this.charge = charge;
        }

        public String getC32A_Currency() {
            return c32A_Currency;
        }

        public void setC32A_Currency(String c32A_Currency) {
            this.c32A_Currency = c32A_Currency;
        }

        public String getField72() {
            return field72;
        }

        public void setField72(String field72) {
            this.field72 = field72;
        }

        public String getTransactionReference() {
            return transactionReference;
        }

        public void setTransactionReference(String transactionReference) {
            this.transactionReference = transactionReference;
        }

        public String getNostroShortName() {
            return nostroShortName;
        }

        public void setNostroShortName(String nostroShortName) {
            this.nostroShortName = nostroShortName;
        }

        public String getC32A_ValueDate() {
            return c32A_ValueDate;
        }

        public void setC32A_ValueDate(String c32A_ValueDate) {
            this.c32A_ValueDate = c32A_ValueDate;
        }

}

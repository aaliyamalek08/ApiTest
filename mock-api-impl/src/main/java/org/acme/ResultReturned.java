package org.acme;


import java.util.List;

public class ResultReturned {
    private String version;

    private String trackingNo;

    private String method;

    private List<MockRecord> record;

    private boolean success = true;

    private String errorType = "None";

    private String message="Request was successful";

    public void setSuccess(boolean success){
        this.success = success;
    }

    public void setRecord(List<MockRecord> record){
        this.record = record;
    }

    public void setErrorType(String errorType){
        this.errorType = errorType;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getVersion(){
        return this.version;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public String getTrackingNo(){
        return this.trackingNo;
    }

    public void setTrackingNo(String trackingNo){
        this.trackingNo = trackingNo;
    }

    public String getMethod(){
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }



    @Override
    public  String toString(){
        return "Result{" +
                "version='" + version + "'" +
                ", trackingNo=" + trackingNo +
                ", method='" + method + "'" +
                ", success=" + success +
                ", errorType='" + errorType + "'" +
                ", message='" + message + "'" +
                ", record=" + record +
                "}";
    }
}

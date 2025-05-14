package org.acme;


import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

@RegisterForReflection
public class ResultReceived {

    private String version;
    private String trackingNo;
    private String method;
    private List<String> fields;
    private Args args;


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

    public List<String> getFields(){
        return this.fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public Args getArgs() {
        return args;
    }

    public void setArgs(Args args) {
        this.args = args;
    }

    @Override
    public  String toString(){
        return "ResultReceived{" +
                "version=" + version + '\'' +
                ", trackingNo=" + trackingNo + '\'' +
                ", method=" + method + '\'' +
                ", args=" + args +
                ", fields=" + fields +
                "}";
    }
}


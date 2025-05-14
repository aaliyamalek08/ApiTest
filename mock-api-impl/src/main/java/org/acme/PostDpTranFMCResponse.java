package org.acme;

import io.quarkus.runtime.annotations.RegisterForReflection;


import java.util.List;


@RegisterForReflection
public class PostDpTranFMCResponse{

    private String sourceSystem;

    private List<ResultReturned> result;


    public void setResult(List<ResultReturned> result) {
        this.result = result;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public List<ResultReturned> getResult(){
        return this.result;
    }

    public String getSourceSystem() {
        return this.sourceSystem;
    }

    @Override
    public String toString(){
        return "PostDpTranFMCResponse{" +
                "sourceSystem=" + sourceSystem +
                ", result=" + result + "}";
    }
}

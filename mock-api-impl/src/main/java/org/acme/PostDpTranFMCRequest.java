package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PostDpTranFMCRequest {

    @JsonProperty("SourceSystem")
    private int sourceSystem;

    @JsonProperty("Mutation")
    private List<Mutation> mutation;

    // Getters and setters
    public int getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(int sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public List<Mutation> getMutation() {
        return mutation;
    }

    public void setMutation(List<Mutation> mutation) {
        this.mutation = mutation;
    }
}

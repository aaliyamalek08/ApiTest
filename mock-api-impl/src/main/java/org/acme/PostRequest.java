package org.acme;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PostRequest{
    @JsonProperty("SourceSystem")
    private int SourceSystem;
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;
    @JsonProperty("Mutation")
    private List<ResultReceived> mutation;

    public PostRequest(){}

    public PostRequest(String name, int age, int sourceSystem, List<ResultReceived> mutation){
        this.name = name;
        this.age = age;
        this.SourceSystem = sourceSystem;
        this.mutation = mutation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSourceSystem(int sourceSystem) {
        this.SourceSystem = sourceSystem;
    }

    public int getSourceSystem() {
        return this.SourceSystem;
    }

    public void setMutation(List<ResultReceived> mutation) {
        this.mutation = mutation;
    }

    public List<ResultReceived> getMutation() {
        return this.mutation;
    }
}

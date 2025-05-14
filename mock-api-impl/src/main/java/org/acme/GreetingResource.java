package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/testing")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/test")
    public String test(){
        return "Test";
    }

    @GET
    @Path("/FMCRequest")
    public String testPost(PostDpTranFMCRequest request) {
        if (request == null) {
            return "Request was null";
        }
        return "Source System: ";
    }
}


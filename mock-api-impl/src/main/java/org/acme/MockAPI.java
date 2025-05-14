package org.acme;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

@Path("/api")
public class MockAPI {

    @POST
    @Path("/posttrans")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postTransaction(PostDpTranFMCRequest request, @Context UriInfo uriInfo) {
        // Extract the service name from the path
        String fullPath = uriInfo.getPath();
        String serviceName = fullPath.substring(fullPath.lastIndexOf('/') + 1); // "posttrans"

        // Logs the service being responded to
        System.out.println("Responding to '" + serviceName + "' Request.");

        // Creates a response message
        String responseMessage = "Responding to '" + serviceName + "' Request.";

        return Response.ok(responseMessage).build();
    }
    //Tests if api is working or not
    @GET
    @Path("/health")
    @Produces(MediaType.TEXT_PLAIN)
    public String healthCheck() {
        return "Mock API is running";
    }

}

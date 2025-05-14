package org.acme;
import jakarta.ws.rs.POST;

//import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
//import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
//import org.urdad.services.RequestNotValidException;
//import org.urdad.services.ServiceProviderNotAvailableException;


public interface MockCoreBankingBGProviderService {
    @POST
    PostDpTranFMCResponse generatePostDpTranFMCResponse(PostDpTranFMCRequest request) ;
}

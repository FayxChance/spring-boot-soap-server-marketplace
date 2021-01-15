package com.marketplace.marketplace;


import localhost.services.GetDeliveryRequest;
import localhost.services.GetDeliveryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
@Endpoint
public class DeliveryEndPoint {
    private static final String NAMESPACE_URI =
            "http://localhost/services";
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetDeliveryRequest")
    @ResponsePayload
    public GetDeliveryResponse getDelivery(@RequestPayload GetDeliveryRequest request) {
        GetDeliveryResponse response = new GetDeliveryResponse();
        response.setCost(request.getDistance()/10 * request.getWeight()/10);

        return response;
    }
}

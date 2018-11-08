package org.wso2.service.paymentservice;

import org.wso2.msf4j.Microservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/payment")
public class PaymentService implements Microservice {

    @POST
    @Path("/reserve")
    @Consumes("application/json")
    @Produces("application/json")
    public Response reserveAmount(ReserveRequest reserveRequest) {
        System.out.println("\n  payment reference :" + reserveRequest.getPaymentInfoReference());
        System.out.println("\n  reserveAmount :" + reserveRequest.getAmount());
        ReserveResponse response = new ReserveResponse("ok","reservation successful", "001");
        return Response.ok().entity(response).build();
    }
}

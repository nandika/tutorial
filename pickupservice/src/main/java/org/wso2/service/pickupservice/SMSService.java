package org.wso2.service.pickupservice;

import org.wso2.msf4j.Microservice;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/smsservice")
public class SMSService implements Microservice {

    @POST
    @Path("/driver/message")
    @Consumes("application/json")
    @Produces("application/json")
    public Response sendDriverSMS(DriverSMSRequest smsRequest) {
        System.out.println("\n          Passenger Name :" + smsRequest.getPassengerName());
        System.out.println("\n          Passenger Phone :" + smsRequest.getPassengerPhone());
        return Response.ok().entity(new SMSResponse("ok", "001")).build();
    }

    @POST
    @Path("/client/message")
    @Consumes("application/json")
    @Produces("application/json")
    public Response sendClientSMS(ClientSMSRequest clientSMSRequest) {
        System.out.println("\n          Driver Name  :" + clientSMSRequest.getDriverName());
        System.out.println("\n          Driver Phone :" + clientSMSRequest.getDriverPhone());
        System.out.println("\n          Vehicle Type :" + clientSMSRequest.getVechileType());
        System.out.println("\n          Driver Name  :" + clientSMSRequest.getNumberPlate());
        return Response.ok().entity(new SMSResponse("ok", "001")).build();
    }


}

package org.wso2.service.pickupservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DriverSMSRequest {


    public DriverSMSRequest() {

    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }

    private String passengerName;
    private String passengerPhone;

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    private String driverPhone;
}

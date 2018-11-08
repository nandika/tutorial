package org.wso2.service.pickupservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClientSMSRequest {
    private String clientPhone;
    private String driverName;
    private String driverPhone;
    private String vechileType;
    private String numberPlate;

    public String getVechileType() {
        return vechileType;
    }

    public void setVechileType(String vechileType) {
        this.vechileType = vechileType;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public ClientSMSRequest(String clientPhone, String driverName, String driverPhone) {
        this.clientPhone = clientPhone;
        this.driverName = driverName;
        this.driverPhone = driverPhone;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }
}

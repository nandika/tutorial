package org.wso2.service.pickupservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SMSResponse {
    private String status;
    private String code;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public SMSResponse(String status, String code) {
        this.status = status;
        this.code = code;
    }

    public void setCode(String code) {

        this.code = code;
    }
}

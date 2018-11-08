package org.wso2.service.paymentservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReserveResponse {
    private String status;
    private String message;
    private String code;

    public ReserveResponse(String status, String message, String code) {
        this.status = status;
        this.message = message;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

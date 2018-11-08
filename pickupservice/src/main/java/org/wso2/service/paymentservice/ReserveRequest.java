package org.wso2.service.paymentservice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReserveRequest {
    public ReserveRequest(String payInfoReference) {
        this.paymentInfoReference = payInfoReference;
    }

    public ReserveRequest(String paymentInfoReference, double amount) {
        this.paymentInfoReference = paymentInfoReference;
        this.amount = amount;
    }


    public String getPaymentInfoReference() {

        return paymentInfoReference;
    }

    public void setPaymentInfoReference(String paymentInfoReference) {
        this.paymentInfoReference = paymentInfoReference;
    }

    private String paymentInfoReference;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount;


}

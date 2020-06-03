package com.codegym.furama.model.validateContract;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class validateContractDetails {
    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^[0-9]{1,}$", message = "Số lượng phải là số nguyên dương")
    private String amountContractDetails;
    private int servicefollowId;

    public validateContractDetails(String amountContractDetails) {
        this.amountContractDetails = amountContractDetails;
    }

    public String getAmountContractDetails() {
        return amountContractDetails;
    }

    public void setAmountContractDetails(String amountContractDetails) {
        this.amountContractDetails = amountContractDetails;
    }

    public int getServicefollowId() {
        return servicefollowId;
    }

    public void setServicefollowId(int servicefollowId) {
        this.servicefollowId = servicefollowId;
    }

    public validateContractDetails() {
    }
}

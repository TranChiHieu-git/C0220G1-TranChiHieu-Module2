package com.codegym.furama.model.ContractModel.ContractDetails;

import com.codegym.furama.model.ContractModel.Contract;
import com.codegym.furama.model.ContractModel.ContractDetails.Servicefollow.ServiceFollow;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contractdetailss")
public class ContractDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idContractDetails;
    private int amountContractDetails;

    @ManyToOne
    @JoinColumn(name = "servicefollow_idservicefollow")
    private ServiceFollow serviceFollow;

    public ServiceFollow getServiceFollow() {
        return serviceFollow;
    }

    public void setServiceFollow(ServiceFollow serviceFollow) {
        this.serviceFollow = serviceFollow;
    }

    @ManyToOne
    @JoinColumn(name = "contract_id")
    public Contract contract;

    public Contract getContract() {
        return this.contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public ContractDetails() {
    }

    public ContractDetails(int amountContractDetails) {
        this.amountContractDetails = amountContractDetails;
    }

    public int getIdContractDetails() {
        return idContractDetails;
    }

    public void setIdContractDetails(int idContractDetails) {
        this.idContractDetails = idContractDetails;
    }

    public int getAmountContractDetails() {
        return amountContractDetails;
    }

    public void setAmountContractDetails(int amountContractDetails) {
        this.amountContractDetails = amountContractDetails;
    }
}

package com.codegym.furama.model.ContractModel;

import com.codegym.furama.model.ContractModel.ContractDetails.ContractDetails;
import com.codegym.furama.model.ServiceModel.Service;
import com.codegym.furama.model.StaffModel.Staff;
import com.codegym.furama.model.UserModel.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contracts")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String contractDate;
    private String endContractDate;
    private int deposit;
    private int totalCost;

    @ManyToOne
    @JoinColumn(name = "service_id")
    public Service service;

    public Service getService() {
        return this.service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @ManyToOne
    @JoinColumn(name = "staff_id")
    public Staff staff;

    public Staff getStaff() {
        return this.staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Contract() {
    }

    public Contract(String contractDate, String endContractDate, int deposit, int totalCost) {
        this.contractDate = contractDate;
        this.endContractDate = endContractDate;
        this.deposit = deposit;
        this.totalCost = totalCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getEndContractDate() {
        return endContractDate;
    }

    public void setEndContractDate(String endContractDate) {
        this.endContractDate = endContractDate;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}

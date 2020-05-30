package com.codegym.furama.model.validateService;

public class ServiceValid {
    private int id;
    private String name;
    private double area;
    private int numberOfFloor;
    private int numberOfMaxPeople;
    private int priceOfRent;
    private String status;
    private int idTypeTent;
    private int idTypeService;

    public ServiceValid() {
    }

    public ServiceValid(int id, String name, double area, int numberOfFloor, int numberOfMaxPeople, int priceOfRent,
                        String status, int idTypeTent, int idTypeService) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.numberOfFloor = numberOfFloor;
        this.numberOfMaxPeople = numberOfMaxPeople;
        this.priceOfRent = priceOfRent;
        this.status = status;
        this.idTypeTent = idTypeTent;
        this.idTypeService = idTypeService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public int getNumberOfMaxPeople() {
        return numberOfMaxPeople;
    }

    public void setNumberOfMaxPeople(int numberOfMaxPeople) {
        this.numberOfMaxPeople = numberOfMaxPeople;
    }

    public int getPriceOfRent() {
        return priceOfRent;
    }

    public void setPriceOfRent(int priceOfRent) {
        this.priceOfRent = priceOfRent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdTypeTent() {
        return idTypeTent;
    }

    public void setIdTypeTent(int idTypeTent) {
        this.idTypeTent = idTypeTent;
    }

    public int getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(int idTypeService) {
        this.idTypeService = idTypeService;
    }
}

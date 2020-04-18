package CaseStudy.FuramaResort.Models;

abstract public class Services implements Massage, Karaoke, Food, Water, RentCar {
    private String id;
    private String nameServices;
    private double areaUsed;
    private double rental;
    private int maxNumberOfPeople;
    private String typeOfRent;
    private String otherAmenities = "\n\t1.Tên dịch vụ: " + Massage.name + ", giá: " + Massage.cost + " USD/" + Massage.unit + "\n"
            + "\t2.Tên dịch vụ: " + Karaoke.name + ", giá: " + Karaoke.cost + " USD/" + Karaoke.slot + "\n"
            + "\t3.Tên dịch vụ: " + Food.name + ", giá: " + Food.cost + " USD/" + Food.slot + "\n"
            + "\t4.Tên dịch vụ: " + Water.name + ", giá: " + Water.cost + " USD/" + Water.slot + "\n"
            + "\t5.Tên dịch vụ: " + RentCar.name + ", giá: " + RentCar.cost + " USD/" + RentCar.slot;

    public Services(String id, String nameServices, double areaUsed, double rental, int maxNumberOfPeople, String typeOfRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUsed = areaUsed;
        this.rental = rental;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRental() {
        return rental;
    }

    public void setRental(double rental) {
        this.rental = rental;
    }

    public double getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public String getOtherAmenities() {
        return this.otherAmenities;
    }

    abstract public String showInfor();
}

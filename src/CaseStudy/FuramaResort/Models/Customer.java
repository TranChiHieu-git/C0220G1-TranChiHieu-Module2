package CaseStudy.FuramaResort.Models;

import java.util.Date;

public class Customer {
    private String name;
    private Date birthday;
    private String sex;
    private int CMND;
    private String numberPhone;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services services;

    Customer() {
    }

    public Customer(String name, Date birthday, String sex, int CMND, String numberPhone, String email,
                    String typeOfCustomer, String address, Services services) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.CMND = CMND;
        this.numberPhone = numberPhone;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfor() {
        return "1.Ho va ten: " + this.getName() + "\n"
                + "2.Ngay sinh: " + this.getBirthday() + "\n"
                + "3.Gioi tinh: " + this.getBirthday() + "\n"
                + "4.CMND: " + this.getCMND() + "\n"
                + "5.So dien thoai: " + this.getNumberPhone() + "\n"
                + "6.Email: " + this.getEmail() + "\n"
                + "7.Loai khach hang: " + this.getTypeOfCustomer() + "\n"
                + "8.Dia chi: " + this.getAddress() + "\n"
                + "9.Loai dich vu su dung: " + this.getServices() + "\n";
    }
}

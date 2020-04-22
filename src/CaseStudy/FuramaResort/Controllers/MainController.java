package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.*;

import java.io.IOException;
import java.util.*;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Room> listRoom = new ArrayList<>();
    ArrayList<Villa> listVilla = new ArrayList<>();
    ArrayList<House> listHouse = new ArrayList<>();
    ArrayList<Customer> listCustomer = new ArrayList<>();
    TreeSet<String> listRoomNotDuplicate = new TreeSet<>();
    TreeSet<String> listHouseNotDuplicate = new TreeSet<>();
    TreeSet<String> listVillaNotDuplicate = new TreeSet<>();
    ReadCsvVilla readCsvVilla = new ReadCsvVilla();
    ReadCsvHouse readCsvHouse = new ReadCsvHouse();
    ReadCsvRoom readCsvRoom = new ReadCsvRoom();
    ReadCsvCustomer readCsvCustomer = new ReadCsvCustomer();
    WriteCsvVilla writeCsvVilla = new WriteCsvVilla();
    WriteCsvRoom writeCsvRoom = new WriteCsvRoom();
    WriteCsvHouse writeCsvHouse = new WriteCsvHouse();
    WriteCsvCustomer writeCsvCustomer = new WriteCsvCustomer();

    public MainController() throws IOException {
    }

    public void displayMainMenu() throws IOException {
        System.out.println("1.Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Booking Movie Ticket 4D\n" +
                "8.Find Employee\n" +
                "9.Exit");
        String choose;
        boolean flag = true;
        do {
            System.out.print("Chọn chức năng bạn muốn sử dụng: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    this.addNewServices();
                    this.displayMainMenu();
                    break;
                case "2":
                    this.showServices();
                    this.displayMainMenu();
                    break;
                case "3":
                    this.addNewCustomer();
                    this.displayMainMenu();
                    break;
                case "4":
                    this.showInformationCustomers();
                    this.displayMainMenu();
                    break;
                case "5":
                    this.addNewBook();
                    this.displayMainMenu();
                    break;
                case "6":
                    System.out.println(choose);
                    this.displayMainMenu();
                    break;
                case "7":
                    System.out.println(choose);
                    this.displayMainMenu();
                    break;
                case "8":
                    System.out.println(choose);
                    this.displayMainMenu();
                    break;
                case "9":
                    writeCsvVilla.ext();
                    writeCsvHouse.ext();
                    writeCsvRoom.ext();
                    writeCsvCustomer.ext();
                    System.exit(0);
                    flag = false;
                    break;
                default:
                    System.out.println("Giá trị nhập vào không chính xác. Vui lòng nhập lại");
                    this.displayMainMenu();
                    break;
            }
        } while (flag);
    }

    public void addNewBook() throws IOException {
        ReadCsvCustomer readCsvCustomer = new ReadCsvCustomer();
        listCustomer = readCsvCustomer.readCsvCustomer();
        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println((i + 1) + "." + listCustomer.get(i).getName() + " | " + listCustomer.get(i).getCMND() + " | "
                    + listCustomer.get(i).getBirthday());
            System.out.println("-------------------------------------------------------------------------------------");
        }
        String choose;
        boolean flag = true;
        do {
            System.out.print("Chọn nguoi dung muon book dich vu: ");
            choose = scanner.nextLine();
            if (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) <= listCustomer.size()) {
                flag = false;
            } else {
                System.out.println("Giá trị nhập vào không chính xác. Vui lòng nhập lại");
            }
        } while (flag);
        newBook();
    }

    public void newBook() throws IOException {
        System.out.println("1.Booking Villa\n" +
                "2.Booking House\n" +
                "3.Booking Room\n" +
                "4.Back to menu\n" +
                "5.exit\n");
        String choose;
        boolean flag = true;
        do {
            System.out.print("Chọn chức năng bạn muốn sử dụng: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    this.displayMainMenu();
                    break;
                case "2":
                    this.displayMainMenu();
                    break;
                case "3":
                    this.displayMainMenu();
                    break;
                case "4":
                    this.displayMainMenu();
                    break;
                case "5":
                    flag = false;
                    System.exit(0);
                    writeCsvVilla.ext();
                    writeCsvHouse.ext();
                    writeCsvRoom.ext();
                    writeCsvCustomer.ext();
                    break;
                default:
                    System.out.println("Giá trị nhập vào không chính xác. Vui lòng nhập lại");
                    this.addNewBook();
                    break;
            }
        } while (flag);
    }

    public void addNewCustomer() throws IOException {
        String name = inputName();
        String birthDay = inputBirthday();
        String gender = inputGender();
        String cmnd = inputCMND();
        String numberPhone = inputNumberPhone();
        String email = inputEmail();
        String typeOfCustomers = inputTypeOfCustomer();
        String address = inputAddress();
        //Services typeOfServices = inputTypeOfServices();

        Customer customer = new Customer(name, birthDay, gender, cmnd, numberPhone, email, typeOfCustomers, address);
        listCustomer.add(customer);
        writeCsvCustomer.writeCsvCustomerFile(listCustomer);
    }

    public void showInformationCustomers() throws IOException {
        listCustomer = readCsvCustomer.readCsvCustomer();
        for (Customer ct : listCustomer) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println(ct.showInfor());
            System.out.println("--------------------------------------------------------------------------------");
        }

    }

    public String inputName() {
        boolean flag = true;
        String name = null;
        do {
            try {
                System.out.print("Ten khach hang: ");
                name = scanner.nextLine();
                String patt1 = "^[A-Z]+[a-z]{1,}";
                int count = 0;
                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) == ' ') {
                        count++;
                    }
                }
                String patt = patt1;
                String patt2 = "[A-Z]{1}+[a-z]{1,}";
                for (int i = 0; i < count; i++) {
                    patt += "+\\s+" + patt2;
                }
                if (name.matches(patt)) {
                    flag = false;
                } else {
                    throw new NameException("Ten phai in hoa ki tu dau tien va khong co khoang trong thua");
                }

            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        while (flag);
        return name;
    }

    public String inputEmail() {
        boolean flag = true;
        String email = null;
        do {
            try {
                System.out.print("Email khach hang: ");
                email = scanner.nextLine();
                String patt = "[A-Za-z0-9\\_]{3,}+\\@+[a-z]{3,10}+\\.+(com|vn|org|edu)$";
                if (email.matches(patt)) {
                    flag = false;
                } else {
                    throw new EmailException("Email phai dung dinh dang abc@abc.abc");
                }
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        while (flag);
        return email;
    }

    public String inputGender() {
        boolean flag = true;
        String gender = "";
        do {
            try {
                System.out.print("Gioi tinh khach hang: ");
                String inputGender = scanner.nextLine();
                String lowCaseGender = inputGender.toLowerCase();
                gender = String.valueOf(lowCaseGender.charAt(0)).toUpperCase();
                for (int i = 1; i < lowCaseGender.length(); i++) {
                    gender = gender.concat(String.valueOf(lowCaseGender.charAt(i)));
                }
                String patt = "(Male|Female|Unknow)";
                if (gender.matches(patt)) {
                    flag = false;
                } else {
                    throw new GenderException("Gioi tinh phai la male, female or unknow");
                }
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        while (flag);
        return gender;
    }

    public String inputCMND() {
        boolean flag = true;
        String cmnd = "";
        do {
            try {
                System.out.print("So cmnd khach hang: ");
                cmnd = scanner.nextLine();
                String patt = "[\\d]{3}+\\s+[\\d]{3}+\\s+[\\d]{3}";
                if (cmnd.matches(patt)) {
                    flag = false;
                } else {
                    throw new IdCardException("CMND phai co 9 chu so va theo dinh dang XXX XXX XXX");
                }
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
            }
        }
        while (flag);
        return cmnd;
    }

    public String inputBirthday() {
        boolean flag = true;
        String birthDay = "";
        do {
            try {
                System.out.print("Ngay sinh khach hang: ");
                birthDay = scanner.nextLine();
                String patt = "[0-9]{2}+\\/+[0-9]{2}+\\/+[0-9]{4}";
                if (birthDay.matches(patt)) {
                    String[] dayMonthYear = birthDay.split("/");
                    Calendar calendar = Calendar.getInstance();
                    if (Integer.parseInt(dayMonthYear[2]) > 1900 && calendar.get(Calendar.YEAR) - Integer.parseInt(dayMonthYear[2]) > 18) {
                        if (Integer.parseInt(dayMonthYear[1]) > 0 && Integer.parseInt(dayMonthYear[1]) < 13) {
                            if (Integer.parseInt(dayMonthYear[0]) > 0 && Integer.parseInt(dayMonthYear[0]) < 32) {
                                flag = false;
                            } else {
                                throw new BirthdayException("Ngay sinh phai tu 01 den 31");
                            }
                        } else {
                            throw new BirthdayException("Thang sinh phai tu 01 den 12");
                        }
                    } else {
                        throw new BirthdayException("Nam sinh phai lon hon 1900 va nho hon nam hien tai 18 nam");
                    }
                } else {
                    throw new BirthdayException("Ngay sinh viet theo dinh dang dd/mm/yyyy");
                }
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }
        while (flag);
        return birthDay;
    }

    public String inputNumberPhone() {
        boolean flag = true;
        String numberPhone = "";
        do {
            System.out.print("So dien thoai khach hang: ");
            numberPhone = scanner.nextLine();
            String patt = "^[0]+[\\d]{9}";
            if (numberPhone.matches(patt)) {
                flag = false;
            } else {
                System.out.println("So dien thoai nhap phai co 10 so");
            }
        }
        while (flag);
        return numberPhone;
    }

    public String inputAddress() {
        String address = "";
        System.out.print("Dia chi khach hang: ");
        address = scanner.nextLine();
        return address;
    }

    public String inputTypeOfCustomer() {
        boolean flag = true;
        String typeOfCustomers = "";
        do {
            System.out.print("Loai khach hang: ");
            typeOfCustomers = scanner.nextLine();
            String patt = "(guest|member|gold|VIP)";
            if (typeOfCustomers.matches(patt)) {
                flag = false;
            } else {
                System.out.println("Loai khac hang bao gom guest, member, gold and VIP");
            }
        }
        while (flag);
        return typeOfCustomers;
    }

    public Services inputTypeOfServices() throws IOException {
        boolean flag = true;
        Services typeOfServices = null;
        do {
            System.out.print("Loai dich vu(nhap vao ma dich vu): ");
            String inputTypeOfServices = scanner.nextLine();
            String key = inputTypeOfServices.charAt(0) + String.valueOf(inputTypeOfServices.charAt(1));
            ArrayList<Villa> villaList = readCsvVilla.readCsvVilla();
            ArrayList<House> houseList = readCsvHouse.readCsvHouse();
            ArrayList<Room> roomList = readCsvRoom.readCsvRoom();
            if (key.equals("VL")) {
                for (Villa vl : villaList) {
                    if (vl.getId().equals(inputTypeOfServices)) {
                        typeOfServices = vl;
                        flag = false;
                    }
                }
            }
            if (key.equals("HO")) {
                for (House ho : houseList) {
                    if (ho.getId().equals(inputTypeOfServices)) {
                        typeOfServices = ho;
                        flag = false;
                    }
                }
            }
            if (key.equals("RO")) {
                for (Room ro : roomList) {
                    if (ro.getId().equals(inputTypeOfServices)) {
                        typeOfServices = ro;
                        flag = false;
                    }
                }
            }
            System.out.println("Ma nhap vao khong chinh xac vui long nhap lai");
        }
        while (flag);
        return typeOfServices;
    }

    public void addNewServices() throws IOException {
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        String choose;
        boolean flag = true;
        do {
            System.out.print("Chọn chức năng bạn muốn sử dụng: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    this.addNewVilla();
                    this.addNewServices();
                    break;
                case "2":
                    this.addNewHouse();
                    this.addNewServices();
                    break;
                case "3":
                    this.addNewRoom();
                    this.addNewServices();
                    break;
                case "4":
                    this.displayMainMenu();
                    break;
                case "5":
                    flag = false;
                    System.exit(0);
                    writeCsvVilla.ext();
                    writeCsvHouse.ext();
                    writeCsvRoom.ext();
                    writeCsvCustomer.ext();
                    break;
                default:
                    System.out.println("Giá trị nhập vào không chính xác. Vui lòng nhập lại");
                    this.addNewServices();
                    break;
            }
        } while (flag);
    }

    public void addNewVilla() throws IOException {

        int i = 1;
        String id = inputId(i);
        String nameServices = inputNameSerVices();
        String areaUsed = inputAreaUsed();
        String rental = inputRental();
        String maxNumberOfPeople = inputMaxNumberOfPeople();
        String typeOfRent = inputTypeOfRent();
        String roomStandard = inputRoomStandard();
        String poolArea = inputAreaPool();
        String numberOfFloors = inputNumberOfFloor();
        Villa villa = new Villa(id, nameServices, Double.parseDouble(areaUsed), Double.parseDouble(rental),
                Integer.parseInt(maxNumberOfPeople), typeOfRent,
                roomStandard, Double.parseDouble(poolArea), Integer.parseInt(numberOfFloors));
        listVilla.add(villa);

        writeCsvVilla.writeCsvVillaFile(listVilla);
    }

    public void addNewHouse() throws IOException {
        int i = 2;
        String id = inputId(i);
        String nameServices = inputNameSerVices();
        String areaUsed = inputAreaUsed();
        String rental = inputRental();
        String maxNumberOfPeople = inputMaxNumberOfPeople();
        String typeOfRent = inputTypeOfRent();
        String roomStandard = inputRoomStandard();
        String numberOfFloors = inputNumberOfFloor();
        House house = new House(id, nameServices, Double.parseDouble(areaUsed), Double.parseDouble(rental),
                Integer.parseInt(maxNumberOfPeople), typeOfRent,
                roomStandard, Integer.parseInt(numberOfFloors));
        listHouse.add(house);

        writeCsvHouse.WriteCsvHouseFile(listHouse);
    }

    public void addNewRoom() throws IOException {
        int i = 3;
        String id = inputId(i);
        String nameServices = inputNameSerVices();
        String areaUsed = inputAreaUsed();
        String rental = inputRental();
        String maxNumberOfPeople = inputMaxNumberOfPeople();
        String typeOfRent = inputTypeOfRent();
        Room room = new Room(id, nameServices, Double.parseDouble(areaUsed), Double.parseDouble(rental),
                Integer.parseInt(maxNumberOfPeople), typeOfRent);
        listRoom.add(room);

        writeCsvRoom.writeCsvRoomFile(listRoom);
    }

    public void showServices() throws IOException {
        System.out.println("1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit\n");
        String choose;
        boolean flag = true;
        do {
            System.out.print("Chọn chức năng bạn muốn sử dụng: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    this.showAllVilla();
                    this.showServices();
                    break;
                case "2":
                    this.showAllHouse();
                    this.showServices();
                    break;
                case "3":
                    this.showAllRoom();
                    this.showServices();
                    break;
                case "4":
                    this.showAllNameVillaNotDuplicate();
                    this.showServices();
                    break;
                case "5":
                    this.showAllNameHouseNotDuplicate();
                    this.showServices();
                    break;
                case "6":
                    this.showAllNameRoomNotDuplicate();
                    this.showServices();
                    break;
                case "7":
                    this.displayMainMenu();
                    break;
                case "8":
                    flag = false;
                    System.exit(0);
                    writeCsvVilla.ext();
                    writeCsvHouse.ext();
                    writeCsvRoom.ext();
                    break;
                default:
                    System.out.println("Giá trị nhập vào không chính xác. Vui lòng nhập lại");
                    this.showServices();
                    break;
            }
        } while (flag);
    }

    public void showAllVilla() throws IOException {
        listVilla = readCsvVilla.readCsvVilla();
        for (Villa villa : listVilla) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println(villa.showInfor());
            System.out.println("----------------------------------------------------------------------");
        }
    }

    public void showAllHouse() throws IOException {
        listHouse = readCsvHouse.readCsvHouse();
        for (House house : listHouse) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println(house.showInfor());
            System.out.println("----------------------------------------------------------------------");
        }
    }

    public void showAllRoom() throws IOException {
        listRoom = readCsvRoom.readCsvRoom();
        for (Room room : listRoom) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println(room.showInfor());
            System.out.println("----------------------------------------------------------------------");
        }
    }

    public String inputId(int i) {
        boolean flag = true;
        String id;
        do {
            System.out.print("Nhap vao id: ");
            id = scanner.nextLine();
            String patt;
            if (i == 1) {
                patt = "(VL)+[0-9]{2}+\\-[0-9]{4}";
            } else if (i == 2) {
                patt = "(HO)+[0-9]{2}+\\-[0-9]{4}";
            } else {
                patt = "(RO)+[0-9]{2}+\\-[0-9]{4}";
            }
            boolean math = id.matches(patt);
            if (math) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }
        } while (flag);
        return id;
    }

    public String inputNameSerVices() {
        boolean flag = true;
        String nameSerVices;
        do {
            System.out.print("Nhap vao ten dich vu: ");
            nameSerVices = scanner.nextLine();
            String patt = "^[A-Z]+[a-z0-9]{1,}+\\s+[a-zA-Z0-9\\s]{0,}";
            boolean math = nameSerVices.matches(patt);
            if (math) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }
        } while (flag);
        return nameSerVices;
    }

    public String inputAreaUsed() {
        boolean flag = true;
        String areaUsed;
        do {
            System.out.print("Nhap vao dien tich su dung: ");
            areaUsed = scanner.nextLine();
            String patt = "^[1-9]+(\\d){1,}+\\.+(\\d){1,}";
            boolean math = areaUsed.matches(patt);
            if (math && (Double.valueOf(areaUsed) > 30.0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return areaUsed;
    }

    public String inputAreaPool() {
        boolean flag = true;
        String areaPool;
        do {
            System.out.print("Nhap vao dien tich ho boi: ");
            areaPool = scanner.nextLine();
            String patt = "^[1-9]+(\\d){1,}+\\.+(\\d){1,}";
            boolean math = areaPool.matches(patt);
            if (math && (Double.valueOf(areaPool) > 30.0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return areaPool;
    }

    public String inputRental() {
        boolean flag = true;
        String rental;
        do {
            System.out.print("Nhap vao gia thue: ");
            rental = scanner.nextLine();
            String patt = "^[0-9]+(\\d){0,}+\\.+(\\d){1,}";
            boolean math = rental.matches(patt);
            if (math && (Double.valueOf(rental) > 0.0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return rental;
    }

    public String inputMaxNumberOfPeople() {
        boolean flag = true;
        String maxNumberOfPeople;
        do {
            System.out.print("Nhap vao so nguoi toi da: ");
            maxNumberOfPeople = scanner.nextLine();
            String patt = "(\\d){1,2}";
            boolean math = maxNumberOfPeople.matches(patt);
            if (math && ((Integer.parseInt(maxNumberOfPeople) > 0) && (Integer.parseInt(maxNumberOfPeople) < 20))) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return maxNumberOfPeople;
    }

    public String inputNumberOfFloor() {
        boolean flag = true;
        String numberOfFloor;
        do {
            System.out.print("Nhap vao so tang: ");
            numberOfFloor = scanner.nextLine();
            String patt = "(\\d){1,2}";
            boolean math = numberOfFloor.matches(patt);
            if (math && (Integer.parseInt(numberOfFloor) > 0)) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }

        } while (flag);
        return numberOfFloor;
    }

    public String inputTypeOfRent() {
        boolean flag = true;
        String typeOfRent = "";
        do {
            System.out.print("Nhap vao kieu thue: ");
            typeOfRent = scanner.nextLine();
            String patt = "day|month|year|hour|week";
            boolean math = typeOfRent.matches(patt);
            if (math) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }
        } while (flag);
        return typeOfRent;
    }

    public String inputRoomStandard() {
        boolean flag = true;
        String roomStandard = "";
        do {
            System.out.print("Nhap vao tieu chuan phong: ");
            roomStandard = scanner.nextLine();
            String patt = "(Normal|Premium|VIP)";
            boolean math = roomStandard.matches(patt);
            if (math) {
                flag = false;
            } else {
                System.out.println("Gia tri nhap vao khong chinh xac. Vui long nhap lai.");
            }
        } while (flag);
        return roomStandard;
    }

    public void showAllNameVillaNotDuplicate() throws IOException {
        listVillaNotDuplicate = readCsvVilla.readCsvVillaNotDuplicate();
        int i = 0;
        for (String listVilla : listVillaNotDuplicate) {
            i++;
            System.out.println(i + "." + listVilla);
            System.out.println("------------------------------------------------------------------------");
        }
    }

    public void showAllNameHouseNotDuplicate() throws IOException {
        listHouseNotDuplicate = readCsvHouse.readCsvHouseNotDuplicate();
        int i = 0;
        for (String listHouse : listHouseNotDuplicate) {
            i++;
            System.out.println(i + "." + listHouse);
            System.out.println("------------------------------------------------------------------------");
        }
    }

    public void showAllNameRoomNotDuplicate() throws IOException {
        listRoomNotDuplicate = readCsvRoom.readCsvRoomNotDuplicate();
        int i = 0;
        for (String listRoom : listRoomNotDuplicate) {
            i++;
            System.out.println(i + "." + listRoom);
            System.out.println("------------------------------------------------------------------------");
        }
    }
}


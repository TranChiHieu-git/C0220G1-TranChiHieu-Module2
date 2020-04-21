package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.House;
import CaseStudy.FuramaResort.Models.Room;
import CaseStudy.FuramaResort.Models.Villa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Room> listRoom = new ArrayList<>();
    ArrayList<Villa> listVilla = new ArrayList<>();
    ArrayList<House> listHouse = new ArrayList<>();
    TreeSet<String> listRoomNotDuplicate = new TreeSet<>();
    TreeSet<String> listHouseNotDuplicate = new TreeSet<>();
    TreeSet<String> listVillaNotDuplicate = new TreeSet<>();
    ReadCsvVilla readCsvVilla = new ReadCsvVilla();
    ReadCsvHouse readCsvHouse = new ReadCsvHouse();
    ReadCsvRoom readCsvRoom = new ReadCsvRoom();

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
                    System.out.println(choose);
                    this.displayMainMenu();
                    break;
                case "4":
                    this.addNewCustomer();
                    this.displayMainMenu();
                    break;
                case "5":
                    System.out.println(choose);
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

    public void addNewCustomer() {

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
        WriteCsvVilla.writeCsvVillaFile(listVilla);

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
        WriteCsvHouse.WriteCsvHouseFile(listHouse);
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
        WriteCsvRoom.writeCsvRoomFile(listRoom);
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
                patt = "(VL)+[0-9]{2}+-[0-9]{4}";
            } else if (i == 2) {
                patt = "(HO)+[0-9]{2}+-[0-9]{4}";
            } else {
                patt = "(RO)+[0-9]{2}+-[0-9]{4}";
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
            String patt = "^[A-Z]+[a-z0-9]{1,}";
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
            String patt = "day|month|year|hour";
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


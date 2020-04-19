package CaseStudy.FuramaResort.Controllers;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    WriteCsvVilla writeCsvVilla = new WriteCsvVilla();
    WriteCsvHouse writeCsvHouse = new WriteCsvHouse();
    WriteCsvRoom writeCsvRoom = new WriteCsvRoom();

    public MainController() {
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
                    System.out.println(choose);
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
        System.out.print("Nhap ma dich vu: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten dich vu: ");
        String nameServices = scanner.nextLine();
        System.out.print("Nhap dien tich su dung: ");
        String areaUsed = scanner.nextLine();
        System.out.print("Nhap gia thue: ");
        String rental = scanner.nextLine();
        System.out.print("Nhap so nguoi toi da: ");
        String maxNumberOfPeople = scanner.nextLine();
        System.out.print("Nhap loai thue: ");
        String typeOfRent = scanner.nextLine();
        System.out.print("nhap tieu chuan phong: ");
        String roomStandard = scanner.nextLine();
        System.out.print("Nhap dien tich ho boi: ");
        String poolArea = scanner.nextLine();
        System.out.print("Nhap so tang: ");
        String numberOfFloors = scanner.nextLine();
        writeCsvVilla.writeCsvVillaFile(id, nameServices, areaUsed, rental, maxNumberOfPeople, typeOfRent,
                roomStandard, poolArea, numberOfFloors);
    }

    public void addNewHouse() throws IOException {
        System.out.print("Nhap ma dich vu: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten dich vu: ");
        String nameServices = scanner.nextLine();
        System.out.print("Nhap dien tich su dung: ");
        String areaUsed = scanner.nextLine();
        System.out.print("Nhap gia thue: ");
        String rental = scanner.nextLine();
        System.out.print("Nhap so nguoi toi da: ");
        String maxNumberOfPeople = scanner.nextLine();
        System.out.print("Nhap loai thue: ");
        String typeOfRent = scanner.nextLine();
        System.out.print("nhap tieu chuan phong: ");
        String roomStandard = scanner.nextLine();
        System.out.print("Nhap so tang: ");
        String numberOfFloors = scanner.nextLine();
        writeCsvHouse.WriteCsvHouseFile(id, nameServices, areaUsed, rental, maxNumberOfPeople, typeOfRent,
                roomStandard, numberOfFloors);
    }

    public void addNewRoom() throws IOException {
        System.out.print("Nhap ma dich vu: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten dich vu: ");
        String nameServices = scanner.nextLine();
        System.out.print("Nhap dien tich su dung: ");
        String areaUsed = scanner.nextLine();
        System.out.print("Nhap gia thue: ");
        String rental = scanner.nextLine();
        System.out.print("Nhap so nguoi toi da: ");
        String maxNumberOfPeople = scanner.nextLine();
        System.out.print("Nhap loai thue: ");
        String typeOfRent = scanner.nextLine();
        writeCsvRoom.writeCsvRoomFile(id, nameServices, areaUsed, rental, maxNumberOfPeople, typeOfRent);
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

                    this.showServices();
                    break;
                case "2":
                    this.showServices();
                    break;
                case "3":
                    this.showServices();
                    break;
                case "4":
                    this.showServices();
                    break;
                case "5":
                    this.showServices();
                    break;
                case "6":
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
}


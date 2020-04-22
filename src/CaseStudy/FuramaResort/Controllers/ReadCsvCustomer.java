package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadCsvCustomer {
    public ArrayList<Customer> readCsvCustomer() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("C:\\codegym\\CodeGym\\Module2\\" +
                "C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\Customer.csv"));
        ArrayList<Customer> listCustomer = new ArrayList<>();
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] splitData = line.split(",");
            Customer custom = new Customer(splitData[0], splitData[1], splitData[2], splitData[3], splitData[4],
                    splitData[5], splitData[6], splitData[7]);
            listCustomer.add(custom);
        }
        Collections.sort(listCustomer, new NameBirthdayComparator());
        return listCustomer;
    }

    public Services inputTypeOfServices(String inputTypeOfServices) throws IOException {
        Services typeOfServices = null;

        String key = inputTypeOfServices.charAt(0) + String.valueOf(inputTypeOfServices.charAt(1));
        ReadCsvVilla readCsvVilla = new ReadCsvVilla();
        ReadCsvHouse readCsvHouse = new ReadCsvHouse();
        ReadCsvRoom readCsvRoom = new ReadCsvRoom();
        ArrayList<Villa> villaList = readCsvVilla.readCsvVilla();
        ArrayList<House> houseList = readCsvHouse.readCsvHouse();
        ArrayList<Room> roomList = readCsvRoom.readCsvRoom();
        if (key.equals("VL")) {
            for (Villa vl : villaList) {
                if (vl.getId().equals(inputTypeOfServices)) {
                    typeOfServices = vl;
                    break;
                }
            }
        } else if (key.equals("HO")) {
            for (House ho : houseList) {
                if (ho.getId().equals(inputTypeOfServices)) {
                    typeOfServices = ho;
                    break;
                }
            }
        } else if (key.equals("RO")) {
            for (Room ro : roomList) {
                if (ro.getId().equals(inputTypeOfServices)) {
                    typeOfServices = ro;
                    break;
                }
            }
        }
        return typeOfServices;
    }
}

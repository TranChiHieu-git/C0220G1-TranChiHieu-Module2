package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.House;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCsvHouse {
    private static final String DAU_PHAY = ",";
    private static final String DONG_MOI = "\n";
    FileWriter fileHouse = null;

    public void WriteCsvHouseFile(ArrayList<House> listHouse)
            throws IOException {
        fileHouse = new FileWriter("C:\\codegym\\CodeGym\\Module2\\C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\House.csv", true);
        for (House house : listHouse) {
            fileHouse.append(house.getId());
            fileHouse.append(DAU_PHAY);
            fileHouse.append(house.getNameServices());
            fileHouse.append(DAU_PHAY);
            fileHouse.append(String.valueOf(house.getAreaUsed()));
            fileHouse.append(DAU_PHAY);
            fileHouse.append(String.valueOf(house.getRental()));
            fileHouse.append(DAU_PHAY);
            fileHouse.append(Integer.toString((int) house.getMaxNumberOfPeople()));
            fileHouse.append(DAU_PHAY);
            fileHouse.append(String.valueOf(house.getTypeOfRent()));
            fileHouse.append(DAU_PHAY);
            fileHouse.append(house.getRoomStandard());
            fileHouse.append(DAU_PHAY);
            fileHouse.append(String.valueOf(house.getNumberOfFloors()));
            fileHouse.append(DONG_MOI);
            fileHouse.flush();
        }

    }

    public void ext() throws IOException {
        try {
            fileHouse.close();
        } catch (Exception e) {
            System.out.println("");
        }

    }
}

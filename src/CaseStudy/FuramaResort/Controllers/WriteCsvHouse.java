package CaseStudy.FuramaResort.Controllers;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvHouse {
    private static final String DAU_PHAY = ",";
    private static final String DONG_MOI = "\n";

    public static void WriteCsvHouseFile(String id, String nameServices, String areaUsed, String rental,
                                         String maxNumberOfPeople, String typeOfRent, String roomStandard,
                                         String numberOfFloors)
            throws IOException {

        FileWriter fileHouse = new FileWriter("C:\\codegym\\CodeGym\\Module2\\C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\House.csv", true);
        fileHouse.append(id);
        fileHouse.append(DAU_PHAY);
        fileHouse.append(nameServices);
        fileHouse.append(DAU_PHAY);
        fileHouse.append(areaUsed);
        fileHouse.append(DAU_PHAY);
        fileHouse.append(rental);
        fileHouse.append(DAU_PHAY);
        fileHouse.append(maxNumberOfPeople);
        fileHouse.append(DAU_PHAY);
        fileHouse.append(typeOfRent);
        fileHouse.append(DAU_PHAY);
        fileHouse.append(roomStandard);
        fileHouse.append(DAU_PHAY);
        fileHouse.append(numberOfFloors);
        fileHouse.append(DONG_MOI);
        fileHouse.close();
    }
}

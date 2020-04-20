package CaseStudy.FuramaResort.Controllers;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCsvRoom {
    private static final String DAU_PHAY = ",";
    private static final String DONG_MOI = "\n";

    public static void writeCsvRoomFile(String id, String nameServices, String areaUsed, String rental,
                                        String maxNumberOfPeople, String typeOfRent)
            throws IOException {

        FileWriter fileVilla = new FileWriter("C:\\codegym\\CodeGym\\Module2\\C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\Room.csv", true);
        fileVilla.append(id);
        fileVilla.append(DAU_PHAY);
        fileVilla.append(nameServices);
        fileVilla.append(DAU_PHAY);
        fileVilla.append(areaUsed);
        fileVilla.append(DAU_PHAY);
        fileVilla.append(rental);
        fileVilla.append(DAU_PHAY);
        fileVilla.append(maxNumberOfPeople);
        fileVilla.append(DAU_PHAY);
        fileVilla.append(typeOfRent);
        fileVilla.append(DONG_MOI);
        fileVilla.close();
    }
}

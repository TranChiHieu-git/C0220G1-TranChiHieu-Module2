package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.Villa;

import java.io.*;
import java.util.ArrayList;

public class WriteCsvVilla {
    private static final String DAU_PHAY = ",";
    private static final String DONG_MOI = "\n";

    public static void writeCsvVillaFile(ArrayList<Villa> listVilla)
            throws IOException {

        FileWriter fileVilla = new FileWriter("C:\\codegym\\CodeGym\\Module2\\C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\Villa.csv", true);
        for (Villa villa : listVilla) {
            fileVilla.append(villa.getId());
            fileVilla.append(DAU_PHAY);
            fileVilla.append(villa.getNameServices());
            fileVilla.append(DAU_PHAY);
            fileVilla.append(String.valueOf(villa.getAreaUsed()));
            fileVilla.append(DAU_PHAY);
            fileVilla.append(String.valueOf(villa.getRental()));
            fileVilla.append(DAU_PHAY);
            fileVilla.append(String.valueOf(villa.getMaxNumberOfPeople()));
            fileVilla.append(DAU_PHAY);
            fileVilla.append(String.valueOf(villa.getTypeOfRent()));
            fileVilla.append(DAU_PHAY);
            fileVilla.append(villa.getRoomStandard());
            fileVilla.append(DAU_PHAY);
            fileVilla.append(String.valueOf(villa.getNumberOfFloors()));
            fileVilla.append(DONG_MOI);
            fileVilla.close();
        }
    }
}

package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.House;
import CaseStudy.FuramaResort.Models.Room;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCsvRoom {
    private static final String DAU_PHAY = ",";
    private static final String DONG_MOI = "\n";

    public static void writeCsvRoomFile(ArrayList<Room> listRoom)
            throws IOException {

        FileWriter fileRoom = new FileWriter("C:\\codegym\\CodeGym\\Module2\\C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\Room.csv", true);
        for (Room room : listRoom) {
            fileRoom.append(room.getId());
            fileRoom.append(DAU_PHAY);
            fileRoom.append(room.getNameServices());
            fileRoom.append(DAU_PHAY);
            fileRoom.append(String.valueOf(room.getAreaUsed()));
            fileRoom.append(DAU_PHAY);
            fileRoom.append(String.valueOf(room.getRental()));
            fileRoom.append(DAU_PHAY);
            fileRoom.append(String.valueOf(room.getMaxNumberOfPeople()));
            fileRoom.append(DAU_PHAY);
            fileRoom.append(String.valueOf(room.getTypeOfRent()));
            fileRoom.append(DONG_MOI);
            fileRoom.close();
        }
    }
}

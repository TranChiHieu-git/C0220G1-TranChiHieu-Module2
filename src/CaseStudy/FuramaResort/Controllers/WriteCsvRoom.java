package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.Room;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCsvRoom {
    private static final String DAU_PHAY = ",";
    private static final String DONG_MOI = "\n";
    FileWriter fileRoom = null;

    public void writeCsvRoomFile(ArrayList<Room> listRoom)
            throws IOException {

        fileRoom = new FileWriter("C:\\codegym\\CodeGym\\Module2\\C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\Room.csv", true);
        for (Room room : listRoom) {
            fileRoom.append(room.getId());
            fileRoom.append(DAU_PHAY);
            fileRoom.append(room.getNameServices());
            fileRoom.append(DAU_PHAY);
            fileRoom.append(String.valueOf(room.getAreaUsed()));
            fileRoom.append(DAU_PHAY);
            fileRoom.append(String.valueOf(room.getRental()));
            fileRoom.append(DAU_PHAY);
            fileRoom.append(Integer.toString((int) room.getMaxNumberOfPeople()));
            fileRoom.append(DAU_PHAY);
            fileRoom.append(String.valueOf(room.getTypeOfRent()));
            fileRoom.append(DONG_MOI);
            fileRoom.flush();
        }
    }

    public void ext() throws IOException {
        try {
            fileRoom.close();
        } catch (Exception e) {
            System.out.println("");
        }

    }
}

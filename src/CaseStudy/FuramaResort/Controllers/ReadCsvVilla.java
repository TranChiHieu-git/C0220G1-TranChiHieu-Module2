package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.Villa;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCsvVilla {
    FileReader fileReader = new FileReader("C:\\codegym\\CodeGym\\Module2\\C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\Villa.csv");

    public ReadCsvVilla() throws IOException {

        int a;
        String value = "";
        while ((a = fileReader.read()) != -1) {
            value += String.valueOf((char) a);
        }
        ArrayList<String> storageData = new ArrayList<>();
        String temp = "";
        for (int j = 0; j < value.length(); j++) {
            if (value.charAt(j) == ',') {
                storageData.add(temp);
                temp = "";
                continue;
            } else {
                temp += value.charAt(j);
            }
        }
        int count=0;
        for (int i=0;i<value.length();i++){
            if (value.charAt(i)=='\n'){
                count++;
            }
        }
        System.out.println(count);
        Villa[] villas = new Villa[count];
        int j = 0;
        for (int i = 0; i < storageData.size(); i += 9) {
            Villa villa = new Villa(storageData.get(i),
                    storageData.get(i + 1),
                    Double.parseDouble(storageData.get(i + 2)),
                    Double.parseDouble(storageData.get(i + 3)),
                    Integer.parseInt(storageData.get(i + 4)),
                    storageData.get(i + 5),
                    storageData.get(i + 6),
                    Double.parseDouble(storageData.get(i + 7)),
                    Integer.parseInt(storageData.get(i + 8)));
            villas[j] = villa;
            j++;
        }
        for (Villa vl : villas) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println(vl.showInfor());
            System.out.println("---------------------------------------------------------------------");
        }
    }
}


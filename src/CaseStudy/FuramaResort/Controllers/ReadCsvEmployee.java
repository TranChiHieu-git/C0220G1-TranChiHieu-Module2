package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadCsvEmployee {
    public Map<String, Employee> readCsvEmployee() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("C:\\codegym\\CodeGym\\Module2\\" +
                "C0220G1-TranChiHieu-Module2\\src\\CaseStudy\\FuramaResort\\Data\\Employee.csv"));
        Map<String, Employee> mapEmployee = new TreeMap<>();
        ArrayList<Employee> listEmployee = new ArrayList<>();
        ArrayList<String> listId = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            if (i < 10) {
                listId.add("00" + i);
            } else {
                listId.add("0" + i);
            }
        }
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] splitData = line.split(",");
            Employee employee = new Employee(splitData[0], Integer.parseInt(splitData[1]), splitData[2]);
            listEmployee.add(employee);
        }

        for (int i = 0; i < listEmployee.size(); i++) {
            for (int j = i; j < listId.size(); j++) {
                mapEmployee.put(listId.get(j), listEmployee.get(i));
                break;
            }
        }
        return mapEmployee;
    }
}

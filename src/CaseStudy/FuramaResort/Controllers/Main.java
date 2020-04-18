package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.House;
import CaseStudy.FuramaResort.Models.Room;
import CaseStudy.FuramaResort.Models.Services;
import CaseStudy.FuramaResort.Models.Villa;

public class Main {
    public static void main(String[] args) {
        Services villa = new Villa("001", "Villa", 1000, 500, 10, "week",
                "5 star", 50, 3);
        System.out.println(villa.showInfor());
        System.out.println("-----------------------------------------------------------------------------------------");
        Services house = new House("002", "House", 500, 300, 6, "day",
                "3 star", 2);
        System.out.println(house.showInfor());
        System.out.println("-----------------------------------------------------------------------------------------");
        Services room = new Room("003","Room",200,100,2,"day");
        System.out.println(room.showInfor());
    }
}

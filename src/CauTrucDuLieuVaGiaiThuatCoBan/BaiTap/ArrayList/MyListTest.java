package CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.ArrayList;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        //test add(value)
        myList.add(8);
        myList.add(5);
        myList.add(2);
        //test print
        myList.print();
        //test add(index)
        myList.add(1, 1854);
        myList.add(2, 1534);
        myList.add(4, 1654);
        myList.print();
        //test remove
        myList.remove(0);
        myList.remove(1);
        myList.remove(2);
        myList.print();
        //test clone


        //test contains
        System.out.println(myList.contains(5));
        System.out.println(myList.contains(1));
        //test indexof
        System.out.println(myList.indexOf(5));
        System.out.println(myList.indexOf(1));
        //test clear
        myList.clear();
        myList.print();
    }
}

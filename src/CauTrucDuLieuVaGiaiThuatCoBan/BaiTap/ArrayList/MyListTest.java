package CauTrucDuLieuVaGiaiThuatCoBan.BaiTap.ArrayList;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        //test add(value)
        System.out.println("add phan tu vao list:");
        myList.add(8);
        myList.add(5);
        myList.add(2);
        //test print
        myList.print();
        //test add(index)
        System.out.println("add phan tu vao list vi tri i:");
        myList.add(1, 1854);
        myList.add(2, 1534);
        myList.add(4, 1654);
        myList.print();
        //test remove
        System.out.println("xoa phan tu khoi list:");
        myList.remove(0);
        myList.remove(1);
        myList.remove(2);
        myList.print();
        //test clone
        System.out.println("clone mang cu thanh mang moi:");
        System.out.println("id cua mang myList: " + myList);
        MyList<Integer> cloneList = myList.clone();
        System.out.println("Phan tu cua mang clonelist:");
        cloneList.print();
        System.out.println("id cua mang clonelist: " + cloneList);
        //test contains
        System.out.println("kiem tra co x trong list khong:");
        System.out.println(myList.contains(5));
        System.out.println(myList.contains(1));
        //test indexof
        System.out.println("tim vi tri x trong list:");
        System.out.println(myList.indexOf(5));
        System.out.println(myList.indexOf(1));
        //test clear
        System.out.println("xoa list:");
        myList.clear();
        myList.print();
        myList.add(2);
        myList.print();

    }
}

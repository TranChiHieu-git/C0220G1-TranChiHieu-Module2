package MangVaPhuongThucTrongJAVA.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index, value;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao gia tri muon them vao mang: ");
        value = input.nextInt();
        do {
            System.out.print("Nhap vao vi tri muon them vao mang: ");
            index = input.nextInt();
        } while (index < 0 && index > arr.length);
        for (int i = arr.length - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

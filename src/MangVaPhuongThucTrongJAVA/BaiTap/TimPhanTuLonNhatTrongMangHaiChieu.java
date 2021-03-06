package MangVaPhuongThucTrongJAVA.BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so hang: ");
        int row = input.nextInt();
        System.out.print("Nhap vao so cot: ");
        int col = input.nextInt();
        double[][] arr2D = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2D[i][j] = ((Math.random() * 50) + 1);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2D[i][j] + " ; ");
            }
            System.out.println();
        }

        double max = arr2D[0][0];
        int posI = 0, posJ = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < arr2D[i][j]) {
                    max = arr2D[i][j];
                    posI = i;
                    posJ = j;
                }
            }
        }
        System.out.print("Phan tu lon nhat trong mang la: " + max + " o vi tri hang: " + posI + " cot: " + posJ);
    }
}

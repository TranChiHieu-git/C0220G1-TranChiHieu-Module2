package AdvanceedObjectOrientedDesign.BaiTap.Resizeable;

import AdvanceedObjectOrientedDesign.BaiTap.Resizeable.shapes.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(42.1);
        squares[2] = new Square(15.2, "yellow", true);
        System.out.println("before resize: ");
        for (Square square : squares) {
            System.out.println(square.getArea());
        }
        System.out.println("after resize: ");
        for (Square square : squares) {
            square.resize(125);
        }
    }
}

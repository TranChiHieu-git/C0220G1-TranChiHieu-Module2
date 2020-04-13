package AdvanceedObjectOrientedDesign.BaiTap.Resizeable;

import AdvanceedObjectOrientedDesign.BaiTap.Resizeable.shapes.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "green", false);

        System.out.println("Pre-resize:");
        for (Circle circle : circles) {
            System.out.println(circle.getArea());
        }

        System.out.println("After-resize:");
        for (Circle circle : circles) {
            circle.resize(50);
        }
    }
}

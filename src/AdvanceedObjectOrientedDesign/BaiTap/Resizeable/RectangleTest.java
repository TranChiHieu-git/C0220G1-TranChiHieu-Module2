package AdvanceedObjectOrientedDesign.BaiTap.Resizeable;

import AdvanceedObjectOrientedDesign.BaiTap.Resizeable.shapes.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(4.1, 4.9, "yellow", false);
        rectangles[2] = new Rectangle(2.4, 1.2);
        System.out.println("Area before: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.getArea());
        }
        System.out.println("Area after: ");
        for (Rectangle rectangle : rectangles) {
            rectangle.resize(50);
        }
    }
}

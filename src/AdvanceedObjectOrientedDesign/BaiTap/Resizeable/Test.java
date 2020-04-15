package AdvanceedObjectOrientedDesign.BaiTap.Resizeable;

import AdvanceedObjectOrientedDesign.BaiTap.Resizeable.shapes.Circle;
import AdvanceedObjectOrientedDesign.BaiTap.Resizeable.shapes.Rectangle;
import AdvanceedObjectOrientedDesign.BaiTap.Resizeable.shapes.Shape;
import AdvanceedObjectOrientedDesign.BaiTap.Resizeable.shapes.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(6);
        shapes[2] = new Rectangle(6, 3);
        ((Circle) shapes[0]).resize(100);
        System.out.println("circle area: " + ((Circle) shapes[0]).getArea());
        System.out.println();
        ((Square) shapes[1]).resize(100);
        System.out.println("Square area: " + ((Square) shapes[1]).getArea());
        System.out.println();
        ((Rectangle) shapes[2]).resize(100);
        System.out.println("Rectangle area: " + ((Rectangle) shapes[2]).getArea());
    }
}

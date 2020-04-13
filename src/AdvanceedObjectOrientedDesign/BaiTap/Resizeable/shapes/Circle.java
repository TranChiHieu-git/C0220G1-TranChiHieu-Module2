package AdvanceedObjectOrientedDesign.BaiTap.Resizeable.shapes;

import AdvanceedObjectOrientedDesign.BaiTap.Resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        String fill = isFilled() ? "filled" : "not filled";
        return "A Circle with radius=" + this.getRadius() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println(this.getArea() + this.getArea() * (percent / 100));
    }
}

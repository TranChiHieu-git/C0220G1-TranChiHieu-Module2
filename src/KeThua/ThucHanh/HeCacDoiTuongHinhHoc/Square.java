package KeThua.ThucHanh.HeCacDoiTuongHinhHoc;

public class Square extends Rectangle {
    private double side = 1.0;

    Square() {

    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setHeight(double height) {
        this.setSide(height);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public String toString() {
        String fill = isFilled() ? "filled" : "not filled";
        return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
    }
}

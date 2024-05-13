package models;

public class Rectangle extends Shape {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        super(0, 0);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}

package models;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super(0, 0);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
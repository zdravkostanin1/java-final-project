package models;

public abstract class Shape {

    private double perimeter;
    private double area;

    public Shape(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();
}

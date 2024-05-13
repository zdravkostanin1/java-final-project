import models.*;

public class Main {
    public static void main(String[] args) {
        /* Exercise 1
        *  Implementation of the classes Dog and Cat that extend the class Animal
        * */
        Animal cat = new Cat("Oscar", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");

        System.out.println("Exercise 1:\n");
        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());

        /* Exercise 2
        *  Implementation of the classes Circle and Rectangle that extend the class Shape
        * */
        System.out.println("\nExercise 2:\n");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 10);

        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
    }
}
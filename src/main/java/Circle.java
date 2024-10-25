package main.java;

public class Circle extends Figure implements Drawable {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
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

    @Override
    public void draw() {
        System.out.println("Draw circle with radius " + radius);
    }
}

package hw_29.shapeAreaPerimeter;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * PI *radius;
    }
}

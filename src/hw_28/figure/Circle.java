package hw_28.figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI * radius * radius;
    }
}

package hw_28.figure;

public class Triangle extends Figure{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (base * height) / 2;
    }
}

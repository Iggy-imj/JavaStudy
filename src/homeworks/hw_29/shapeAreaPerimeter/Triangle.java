package homeworks.hw_29.shapeAreaPerimeter;

public class Triangle extends Shape {
    private double base, height;
    private double a, b, c;
    private boolean usingBaseHeight;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.usingBaseHeight = false;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.usingBaseHeight = true;
    }

    @Override
    double getArea() {
        if (usingBaseHeight) {
            return (base * height) / 2;
        }
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        if (usingBaseHeight) {
            System.out.println("\nI cannot calculate perimeter with base and height 😞");
            //return 0;
        }
        return a + b + c;
    }
}

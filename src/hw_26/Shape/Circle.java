package hw_26.Shape;

public class Circle extends Shape{
    private double radius;
    public static final double PI = 3.14;

    public Circle(String name) {
        super(name);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Площадь " + name + ": " + area);
    }
}

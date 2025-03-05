package hw_26.Shape;

public class Shape {
    protected String name;
    protected String color;

    public Shape(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Фигура: " + name + ", Цвет: " + color);
    }
}

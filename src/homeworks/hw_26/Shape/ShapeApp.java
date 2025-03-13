package homeworks.hw_26.Shape;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Прямоугольник");
        rectangle.setColor("Красный");
        rectangle.setDimensions(5,10);
        rectangle.info();
        rectangle.calculateArea();

        System.out.println();

        Circle circle = new Circle("Круг");
        circle.setColor("Зеленый");
        circle.setRadius(8);
        circle.info();
        circle.calculateArea();
    }
}

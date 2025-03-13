package homeworks.hw_28.figure;

public class CalculateAreaApp {
    public static void main(String[] args) {

        Figure[] figures = {new Circle(4), new Square(8), new Triangle(6,8)};

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Площадь фигуры: " + figures[i].calculateArea());
        }
    }
}

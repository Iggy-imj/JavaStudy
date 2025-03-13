package homeworks.hw_29.shapeAreaPerimeter;


public class ShapeApp {
    public static void main(String[] args) {

        Shape[] shapes = {new Circle(5), new Rectangle(4,6),
                new Triangle(3,4,5), new Triangle(4,3)};

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].getArea();
            double perimeter = shapes[i].getPerimeter();

            System.out.println(shapes[i].getClass().getSimpleName() + " - Area: " + area + ", Perimeter: " + perimeter);
            totalArea += area;
            totalPerimeter += perimeter;
        }

        System.out.println("\n-------------------\n");

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);


    }

}

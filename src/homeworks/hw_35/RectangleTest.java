package homeworks.hw_35;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        System.out.println(rect1);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println(rect2);
        Rectangle rect3 = new Rectangle(4.0, 2.0);
        System.out.println(rect3);

        System.out.println("rect1.equals(rect2): " + rect1.equals(rect2));
        System.out.println("rect1.equals(rect3): " + rect1.equals(rect3));


    }
}

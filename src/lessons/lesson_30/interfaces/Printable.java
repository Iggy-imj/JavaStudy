package lessons.lesson_30.interfaces;

public interface Printable {

    public static final String color = "block";
    // Интерфейс - совокупность абстрактных методов, задающих поведение
    // Сам интерфейс косвенно абстрактный
    // Все методы интерфейса косвенно и абстрактные и публичные
    void print();

    default void defaultMethod() {
        System.out.println("Default method");

    }

    static void testStaticMethod(String str) {
        System.out.println("Static method: " + str);
    }

}

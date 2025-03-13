package lessons.lesson_23;

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Rnjnj", 8, 5);
        cat.sayMeow();

        System.out.println(cat.toString());
        // System.out.println(cat.age);

        // недоступны так как помечены переменные как private
        // cat.age = 1000;
        // cat.weight = 1000;
        // cat.name = null;
        System.out.println(cat.toString());

        // cat.testMethod(); // метод не доступен так как помечен private

        int catAge = cat.getAge();
        System.out.println("будет лет " + catAge +1);
        System.out.println("Вес " + cat.getWeight());
        System.out.println("Имя " + cat.getName());

        cat.setAge(15);
        System.out.println(cat.toString());

        cat.setWeight(-20);
        System.out.println(cat.toString());

        System.out.println("\n=============");
        cat.isProtected = true;
        System.out.println("isProtected - " + cat.isProtected);

        cat.isDefault = false;
        System.out.println("isDefault - " + cat.isDefault);

    }
}

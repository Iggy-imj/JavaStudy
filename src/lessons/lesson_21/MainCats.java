package lessons.lesson_21;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); // создание обьекта класса Cat
        // 1. Физически создается обьект типа Cat в памяти

        /*
        При создании обьекта класса все его поля инициализируются какими-то значениями
        Поведение по умолчанию (если не задано другое поведение)
        поля инициализируются значениями по умолчанию для своего типа данных
        для числовых притимов 0 / 0.0
        для boolean -> false
        для ссылочных(String в том числе)-> null
         */

        // 2. Конструктор класса - для инициализации свойств обьекта
        // заполнение полей значениями

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Name: " + catName);

        System.out.println("Age: " + cat.age);

        System.out.println("\n-----------------");

        Cat cat1 = new Cat("Max");
        //  будет создан новый обьект класса Cat
        // имя (строка) которая была передана в конструктор будет
        // присвоено свойству name обьекта   класса


        System.out.println("cat1.name - " + cat1.name);
        System.out.println("cat1.color - "+ cat1.color);
        cat.whoAmI();

        System.out.println("\n-----------------");
        Cat cat2 = new Cat("Diamond", "red");

        cat2.whoAmI();

        Cat barsik = new Cat("Barsik", "white", 2);
        System.out.println("barsik.name - " + barsik.name);
        System.out.println("barsik.color - " + barsik.color);
        System.out.println("barsik.age - " + barsik.age);

        barsik.whoAmI();

        Cat catClone = barsik;

        catClone.whoAmI();

        barsik.age = 100;
        System.out.println("barsik.age = 100");
        barsik.whoAmI();

        catClone.whoAmI();

        System.out.println("\n-----------------");
        catClone.age = 200;
        barsik.whoAmI();

        System.out.println("\n-----------------");
        catClone = new Cat("Popa", "Red", 99);
        catClone.whoAmI();

        barsik.whoAmI();

        catClone = null; //  ссылка не ссылается ни на какой обьект
        // у null нельзя вызвать метод, присвоить или получить значение поле -NPE





    }
}

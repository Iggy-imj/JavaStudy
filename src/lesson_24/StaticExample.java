package lesson_24;

// Статические члены класса имеют доступ/ видят только статический контент

public class StaticExample {

    // не статическое поле класса
    int x;

    // static поле класса
    static int staticY;

    //статический метод
    public static  void staticMethod() {
        // статические методы видят только статические члены - поля и методы - класса
        // x++; -  нет доступа к не статическом полю
        staticY++; //к статическому полю есть

        // можем вызывать только статические методы
        // ключевое слово this не доступно
        // this.x
        System.out.println("Вызван статический метод: " + staticY);
    }

    // НЕ статический метод
    public void nonStaticMethod() {
        // у нестатического метода есть доступ КО ВСЕМ членам класса
        x++;
        staticY++;
        //можем вызывать статические и не статические методы
        staticMethod();
    }


    // метод мейн статический
    public static void main(String[] args) {
//      x = 10; // ошибка компиляции - у статик метода нет доступа к НЕ статик переменным
        staticY = 10;
        System.out.println(staticY);

        // не могу вызвать не статический метод без создания обьекта
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();

        //  я могу вызвать статический метод без создания обьекста
        StaticExample.staticMethod();

        int sum = MathUtil.sumIntegers(1,2,5,6,7,8,9);
        System.out.println("SUM: " + sum);

    }
}

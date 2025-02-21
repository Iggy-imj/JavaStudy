package lesson_17;

public class MethodsExample {

    public static void main(String[] args) {

        sayHello();

        char ch = 'A';

        printdecimalCodeOfChar(ch);

        int[] array = {1, 45, 76, 54, 900, 435, 9, 0};
        printArray(array);
        int[] array2 = {1, 2, 3, 4, 5, 6, 56, -100, 6545, 3444, 54, 23};
        printArray(array2);

        String[] strings = {"Hello", "Java", "Test"};
        printArray(strings);

        testParameterOrder(1, "Hello");
        testParameterOrder("Java", 200);


    } // Method area - место написания методов

    /*
    ПЕРЕГРУЗКА МЕТОДОВ

    В пределах одного класса можеть быть два и более методов с одинаковым именемб
    но разным набором параметров (тип и порядок параметров имеет значение)
     */

    public static void testParameterOrder(int x, String str) {
        System.out.println("INT + STRING: " + x + " | " + str);
    }

    public static void testParameterOrder(String string, int y) {
        System.out.println("Другое поведение: " + string + " | " + y);
    }

//  метод "Красиво" выводящий все элементы массива СТРОК
    public static void printArray(String[] strings) {
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + (i == strings.length - 1 ? "]\n" : ", "));
        }
    }



//  метод "Красиво" выводящий все элементы массива целых чисел
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // перебираю индексы масива
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

    public static void printdecimalCodeOfChar(char ch1) {
        // char ch1 = ch (из аргумента вызова) - условно выполняемая строка при вызове метода
        System.out.println((int) ch1);
    }

    public static void sayHello() {
        // тело метода
        System.out.println("Hello, World!");
    }
}

package lessons.lesson_18;

public class MethodsExample2 {
    public static void main(String[] args) {
        int temp = 55;
        changeMe(temp);
        System.out.println(temp); // 55

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);
        changeMe(numbers);
        printArray(numbers);

        System.out.println("\nnumbers: ");
        int[] link2 = numbers;
        link2[2] = -100;
        printArray(numbers);

        // null -  специальное значение указывающее что ссылка не ссылается на обьект
        // - отсутствие значение переменной -  это ничто
        numbers = null;

//      numbers[0] = 10; // Ошибка возникает во время работы программы
        // нельзя взять 0-й эелемент у ничего
//      System.out.println(numbers.length); // нельзя узнать длину ничего (null)

        link2[7] = 0;
        printArray(link2);

        numbers = new int[]{10, 20, 30};
        System.out.println("\nnumbers: ");
        printArray(numbers);

        String hello = "Hello";
        changeMe(hello);
        System.out.println("hello main: " + hello);

        String str2 = hello.toUpperCase();
        System.out.println("str2: " + str2);
        System.out.println("hello: " + hello);




    } // Method area --------------------------------

    public static void changeMe(String str) {
        str = str + "!!!";
        System.out.println("str method: " + str);
    }

    public static void changeMe(int[] array) {
        System.out.println("\n" + array.length);
        array[0] = 1000;
    }

    public static void changeMe(int x) {
        x = 100;
    }



    // Метод "красиво" выводящий все элементы массива ЦЕЛЫХ ЧИСЕЛ
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // перебираю индексы массива
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }

}

package lesson_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        /*
        for (<Блок инициализации>; <Блок проверок / условия выхода>; <Блок изменений>) {
            // тело цикла
         */

//  Вывести все числа 0 до 10

//  while
        int j = 0;
        while (j < 10) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();
        System.out.println("j после цикла: " + j);

//  for
        for (int i = 0; i < 10; i++){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("После цикла for");

//  Запуститься бесконечный цикл. Для цикла for ни один из блоков не является обязательным
/*      for ( ; ; ) {
            System.out.println("Hello, World!");
        }
*/
       int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 100_000_000) {
            System.out.print(i1 + ", ");
        }
        System.out.println();
        System.out.println("----------------\n");

//  В блок инициализации может быть переменная любого типа
        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }
//  Мы можем инициализировать и изменять любое колич-во пременных в блоках инициализации и/или изменений
        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " | " + a + " | " + f);
        }
        System.out.println("----------------\n");



//  Создать массив целых чисел случайной длины от 5 до 15
//  Заполнить массив случайными значениями от - 50 до 50 включительно

        Random random = new Random();
//          int length = random.nextInt(11) + 5;

        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        for (int i=0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }
//      System.out.println("]");

//  Найти минимальное значение в массиве
    int min = ints[0];
    for (int i=0; i < ints.length; i++ ){
        if (ints[i] < min) min = ints[i];
    }
    System.out.println("Минимальное значение в массиве: " + min);

//  continue, break

    for (int i = 0; i < 7; i++) {
        if (i == 3) continue; // прервает текущую итерацию цикла и перейти к следующей итерации
        // мы перейдем в блок изменени  переменных (i++) и потом в блок проверки условий
        // в текущей итерации все команды после continue будут пропущены
        System.out.print(i + ", ");
    }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            if (i == 3) break; // break - прекращает текущую итерацию и работу всего цикла
            // все последующие итерации не будут выполнены (независимо от условий в блоке проверок)
            System.out.print(i + ", ");
        }
        System.out.println();


    }
}

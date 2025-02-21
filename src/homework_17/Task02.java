package homework_17;
/*
Task 2
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит массив + индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
 */

public class Task02 {
    public static void main(String[] args) {
        int[] array = {2, 3, 8, 10, 45, 87, 94};
        printArrayReverse(array);
        int index = 3;
        printArrayReverse(array,index);

    }

    public static void printArrayReverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i > 0 ? ", " : "]\n"));
        }
    }

    public static void printArrayReverse(int[] array, int index) {
        if (index < 0 || index > array.length){
            System.out.println("Недопустимый индекс!");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }

        if (index > 0) {
            System.out.print(", ");
        }

        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i]);
            if (i > index) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

}

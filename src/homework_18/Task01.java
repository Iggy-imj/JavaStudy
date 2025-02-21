package homework_18;
/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:
{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */

public class Task01 {
    public static void main(String[] args) {
        int[] array1 = {2, 4,5,7,3,2,7,4,2,4535,3456,35,67};
        int[] array2 = {2, 4,5,7,3,2,7,4,2};

        copyArray(array1, 3);
        copyArray(array2, 12);


    }//----------------
    public static void copyArray(int[] originalArray, int newLength) {
        int[] newArray = new int[newLength];

        int lengthToCopy = (originalArray.length < newLength) ? originalArray.length : newLength;

        for (int i = 0; i < lengthToCopy; i++){
            newArray[i] = originalArray[i];
        }
        System.out.print("[");
        for (int i = 0; i < newArray.length; i++) { // перебираю индексы массива
            System.out.print(newArray[i] + (i != newArray.length - 1 ? ", " : "]\n"));
        }
    }
}

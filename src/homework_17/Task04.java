package homework_17;
/*
Task 4 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
Посчитайте сколько получилось таких чисел в массиве.

Простое число - число, которое делится на цело только на 1 и само себя.
Пример простых чисел: 3, 5, 7, 11, 13 и т.д.

 */

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Генерация чисел от 1 до 100
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }

        int primeCount = 0; // Счетчик простых чисел
        StringBuilder primeNumbers = new StringBuilder(); // Строка для хранения простых чисел

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true; // Предполагаем, что число простое

            if (array[i] <= 1) { // Числа меньше или равные 1 не являются простыми
                isPrime = false;
            } else {
                for (int j = 2; j < array[i]; j++) { // Проверка делимости от 2 до самого числа (не включая его)
                    if (array[i] % j == 0) {
                        isPrime = false; // Число делится на j, значит, оно не простое
                        break; // Выходим из цикла, если нашли делитель
                    }
                }
            }

            if (isPrime) {
                if (primeCount > 0) { // Добавляем запятую перед следующим простым числом (если оно не первое)
                    primeNumbers.append(", ");
                }
                primeNumbers.append(array[i]); // Добавляем простое число в строку
                primeCount++; // Увеличиваем счетчик простых чисел
            }
        }

        System.out.println("Простые числа в массиве: " + primeNumbers.toString()); // Выводим строку с простыми числами
        System.out.println("Количество простых чисел в массиве: " + primeCount);
    }
}
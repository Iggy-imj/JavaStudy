package homeworks.hw_31.lists;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private T[] array;
    private int cursor;

    public MyArrayList() {
        this.array = (T[]) new Object[10];
    }

    public MyArrayList(T[] array) {
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = Arrays.copyOf(array, array.length * 2);
            cursor = array.length;
        }
    }

    // Добавление в массив одного элемента
    public void add(T value) {
        if (cursor == array.length) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    @Override
    public void addAll(T... values) {

    }

    // Динамическое расширение массива
    private void expandArray() {
        System.out.println("Расширяем внутренний массив! Курсор = " + cursor);
        array = Arrays.copyOf(array, array.length * 2);
    }

    // Текущее кол-во элементов в массиве
    public int size() {
        return cursor;
    }

    @Override
    public int indexOf(T value) {
        return 0;
    }

    @Override
    public int lastIndexOf(T value) {
        return 0;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    // Возвращает значение по индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null; // todo ??????
    }

    @Override
    public void set(int index, T value) {

    }

    // Удалить элемент по индексу. Вернуть старое значение
    public T remove(int index) {
        if (index >= 0 && index < cursor) {
            T value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        }
        return null; // todo ??????
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    //

    // Возвращает строковое представление массива
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, cursor));
    }






    //------------------------------------------------------------------------

//    // Добавление в массив нескольких элементов
//    public void add(int... numbers) {
//        // с numbers я могу обращаться точно также, как со ссылкой на массив int
////        System.out.println("Принял несколько int: " + numbers.length);
////        System.out.println(Arrays.toString(numbers));
////        System.out.println("У каждого инта есть индекс, как в массиве: " + numbers[0]);
//
//        // перебираю все значение. Для каждого вызываю метод add()
//        for (int i = 0; i < numbers.length; i++) {
//            add(numbers[i]);
//        }
//    }
//
//
//
//
//
//
//
//
//    // Поиск по значению.
//    // {1, 100, 5, 24, 0, 5} -> indexOf(5) = 2; indexOf(50) = -1;
//    public int indexOf(int value) {
//        // Перебираю все значимые элементы.
//        // Если элемент равен искомому - вернуть индекс такого элемента
//        // Если перебрал все элементы =- не нашел совпадений - вернуть -1
//
//        for (int i = 0; i < cursor; i++) {
//            if (array[i] == value) {
//                // Значения совпали. Возвращаю индекс
//                return i;
//            }
//        }
//
//        // Сюда мы попадем, если ни одно значение в массиве не совпало
//        return -1;
//    }
//
//    // Индекс последнего вхождения.
//    // {1, 100, 5, 100, 24, 0, 100} -> lastIndexOf(100) -> 6
//    public int lastIndexOf(int value) {
//
//        for (int i = cursor - 1; i >= 0; i--) {
//            if (array[i] == value) return i;
//        }
//
//        return -1;
//
//        /*
//        int index = -1;
//        for (int i = 0; i < cursor; i++) {
//            if (array[i] == value) {
//                // Значения совпали, обновляю переменную index
//                index = i;
//            }
//        }
//        return index;
//         */
//
//    }
//
//    // Удаление элемента по значению
//    public boolean removeByValue(int value) {
//               /*
//        1. Есть ли элемент с  таким значением - indexOf
//        2. Если элемента нет - ничего не пытаемся удалить - возвращаем false
//        3. Если найден - удалить и затем вернуть true.
//         */
//        int index = indexOf(value);
//        if (index < 0) return false;
//
//        // В эту строку кода попадем, только при index = 0 или больше
//        remove(index);
//        return true;
//    }
//
//    //  // {1, 100, 5, 100, 24, 0, 100}
////    int[] findAllValues(int value) {
////       // {1, 3, 6}
////        return null;
////    }
//
//    // Массив, состоящий из элементов магического массива
//    public int[] toArray() {
//        int[] result = new int[cursor];
//        for (int i = 0; i < cursor; i++) {
//            result[i] = array[i];
//        }
//        return result;
//    }
//
//
//    public void test() {
//        System.out.println(Arrays.toString(array));
//    }

}

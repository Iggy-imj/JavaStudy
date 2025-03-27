package lessons.lesson_43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        //Интерфейс Collection
        // гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        // (List, Queue, Set)


        // Ссылка типа интерфейс
        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();

        // int size() - возвращает кол-во элементов в коллекции
        System.out.println("strings.size(): " + strings.size());


        // boolean isEmpty() - возвращает true, если коллекция пуста
        System.out.println("strings.isEmpty(): " + strings.isEmpty());

        // boolean add(T t) - возвращает элемент в коллекцию
        strings.add("Java");
        System.out.println("strings.add: " + strings.add("Python"));

        // Переопределение метода toString для красивого вывода элементов коллекции
        System.out.println(strings);

        // Статический метод .of() - метод в нескольких интерфейсах и классах JFC
        // был введен в Java 9
        // создает неизменяемый(нельзя удалить или добавить элемент) экземпляр коллекции из предоставленных элементов
        Collection<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println("integers" + integers);
        // integers.add(9); // попытка модифицировать/ изменить неизменяемую коллекцию приведет к ошибке

        strings.addAll(List.of("Java Script", "Ruby", "Go Land"));
        System.out.println(strings);

        System.out.println("\n===================");

        // removeAll(Collection<?> colB) - удаляет все элементы содержащиеся в коллекции colB из коллекции на который вызван метод
        // colA.removeAll(colB) - Удаляет из А все элементы которые содержит кол В

        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));

        colA.removeAll(List.of(3,2,1));

        System.out.println("colA.removeAll(List.of(3,2,1)): " + colA);

        // Пересечение
        // retainAll(Collection<?> colB) -
        // Оставляет в коллекции вызова только те элементы которые содержаться в коллекции В
        // colA.retainAll(colB)
        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10,20,30,20,40,50,60));
        colB.addAll(List.of(20,30,40,100));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("retainAll(colB): " + colA);

        //
        System.out.println("colA.containsAll(List.of(20,30): " + colA.containsAll(List.of(20,30))); // True



        // boolean remove(Object obj) - удаляет элемент из коллекции. Вернет true , если элемент был удален
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(20): " + colA.remove(20));
        // Удалит одно значение даже если элементов с таким значением несколько
        System.out.println("colA: " + colA);

        // удалить все значения, например 20
        colA.removeAll(List.of(20));
        System.out.println("colA: " + colA);

        // clear() - удаляет все элементы из коллекци - очищает коллекцию
        colA.clear();
        System.out.println("colA: " + colA);


    }
}

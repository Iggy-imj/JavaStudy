package lessons.lesson_45;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {

        // Map<K, V>

        Map<Integer, String> oldTable = new Hashtable<>(); // Устаревшая, медленная. НЕ рекомендуется к использованию

        Map<String, String> phoneBook = new HashMap<>();
        //добавить ключ + значение

        // V put(K key, V value) -> возвращает старое значение, соответствующее ранее этому ключу
        // Если такого ключа еще не было, вернет null
        System.out.println(phoneBook.put("Hanna", "+49-11111"));
        phoneBook.put("Max", "+49-222222");
        phoneBook.put("John", "+49-333333");

        System.out.println("phoneBook" + phoneBook);

        phoneBook.put(null, "+49-00000");

        String oldValuse = phoneBook.put("John", "+49-444444");
        System.out.println("oldValuse: " + oldValuse);
        System.out.println("phoneBook: " + phoneBook);

        //putAll - принимает карту и копирует все пары ключ-значения из этой карты
        Map<String,String> book2 = new HashMap<>();
        book2.put("Sebastian", "+49-55555");
        book2.put("Michael", "+49-66666");

        phoneBook.putAll(book2);

        System.out.println("phoneBook: " + phoneBook);

        // boolean containsKey(Object key) -  вернет true если карта содержит такой ключ
        // boolean containsValue(Object value) -  вернет true если карта содержит хотя бы одно такое значение
        System.out.println("phoneBook.containsKey(\"Michael\"): " + phoneBook.containsKey("Michael"));
        System.out.println("phoneBook.containsKey(\"123\"): " + phoneBook.containsKey("123"));

        System.out.println("phoneBook.containsValue(\"+49-444444\"): " + phoneBook.containsValue("+49-444444"));




        System.out.println("\n==== GET ====");

        // Взятие значения по ключу
        // V get (K key) - возвращает значение по ключу
        String value = phoneBook.get("Hanna");
        System.out.println("phoneBook.get(\"Hanna\"): " + value);

        System.out.println("phoneBook.get(\"KEY\"): " + phoneBook.get("KEY"));

        //getOrDefault(Object key, V defaultValue)
        // возвращает значение по ключу. если ключа нет то вернет значение по умолчанию
        String value2 = phoneBook.getOrDefault("Hanna", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"Hanna\", \"DEFAULT\"): " + value2);
        value2 = phoneBook.getOrDefault("KEY", "DEFAULT");
        System.out.println("phoneBook.getOrDefault(\"KEY\", \"DEFAULT\"): " + value2);

        System.out.println("Objects.hashCode(null): " + Objects.hashCode(null));



        System.out.println("\n==============\n");
        // Конструкторы

        Map<Integer, String> construct = new HashMap<>(); // создается пустой список пар ключ-значение.
        // 16 корзин. Коэффициент заполнения 0,75
        construct = new HashMap<>(30); //создается пустой словарь. 32 корзины. заполнение 0,75
        construct = new HashMap<>(32, 0.90f);
        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");
        construct = new HashMap<>(otherMap); // скопирует все пары ключ-значения
        System.out.println("construct: " + construct);

        // V remove(Object key)
        System.out.println("phoneBook: " + phoneBook);
        System.out.println(phoneBook.remove("Sebastian"));
        // boolean remove(Object key, Object value) - удаляет пару ключ-значение,
        // только если ключ и значение соответствуют текущим в карте
        System.out.println("phoneBook.remove(\"John\", \"0000\"): " + phoneBook.remove("John", "0000"));
        System.out.println("phoneBook.remove(\"John\", \"+49-444444\"): " + phoneBook.remove("John", "+49-444444"));

        System.out.println("phoneBook: " + phoneBook);

        // void clear() - очищает карту
        // int size() -  возвращает кол-во элементов
        System.out.println("phoneBook.size(): " + phoneBook.size());
        // boolean is Empty()





    }

}

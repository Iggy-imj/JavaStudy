package lessons.lesson_46;

import java.util.*;

public class MapExample3 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(100, "black");
        map.put(17, "orange");
        map.put(1, "red");


        System.out.println("map: " + map);

        // Collection<V> values() - коллекция всех значений карты
        Collection<String> values = map.values();
        System.out.println("map.values(): " + values);

        // Set<K> keySet() - возврашает set
        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);

        // могу получить ключи в цикле и получить все значения
        for (Integer key : keys) {
            System.out.print(map.get(key) + "; ");
        }
        System.out.println();


        // ФОКУС

        keys.remove(17);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("\n======");
        values.remove("green");
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("\n========");
        map.remove(16);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("\n========");
        values.removeAll(List.of("red"));
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);
        System.out.println("values: " + values);

        System.out.println("\n========");
        Set<Integer> keysCopy = new HashSet<>(map.keySet());
        keysCopy.remove(0);
        System.out.println("keysCopy: " + keysCopy);
        System.out.println("map: " + map);

        System.out.println("\n==== Map.Entry ====\n");
        //  Set<Map.Entry<Integer, String>> entrySet() - возвращает set вхождений всех парк ключ-значение
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.print("entry: " + entry + " -> " + entry.getKey() + " | " + entry.getValue()+ "\n");
        }

        // Живая связь
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getKey().equals(100)) {
                entry.setValue("Java");
            }
        }
        System.out.println("map: " + map);


        //
        System.out.println("\n========");

        System.out.println(map.put(11, "orange")); // если ключа нет то добавится новая пара
        System.out.println(map.put(11, "green")); //  если есть то перепишет

        // replace(K key, V value)

        System.out.println(map.replace(200,"red")); // ключа нет - новая пара не добавляется
        System.out.println(map.replace(15,"red")); // если ключ есть - значение будет переписано

        System.out.println("map: " + map);

        // foreach
        System.out.println("\n========");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            // могу что-то делать с этими значениями
            System.out.println(key + " : " + value);
        }
        System.out.println("\n========");
        //
        map.forEach((Integer k, String v) -> System.out.println(k + " = " + v));

        System.out.println("\n==== Многострочное действие ====");
        map.forEach((Integer key, String val) -> {
            System.out.println("Iteration: ");
            System.out.println("key: " + key + " | Value: " + val);
            System.out.println("========");
                });





    }
}

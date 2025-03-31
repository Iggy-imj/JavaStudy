package lessons.lesson_45;

import java.util.*;

public class MapExample2 {
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


     }
}

package homeworks.hw_45;

import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        System.out.println("Частота слов:");
        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
    }


    public static Map<String, Integer> frequencyDictionary(String text) {
        Map<String, Integer> wordMap = new HashMap<>();
        text = text.toLowerCase().replace(".", "").replace(",", "");

        String[] words = text.split("\\s+");

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        return wordMap;
    }


    public static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (char ch : text.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        return charMap;
    }
}

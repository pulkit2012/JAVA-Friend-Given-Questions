package Diksha;

import java.util.HashMap;
import java.util.Map;

public class DupliCounter {
    public static Map<Character, Integer> countDuplicateCharacters(String string) {
        var resultMap = new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                resultMap.put(string.charAt(i), resultMap.getOrDefault(string.charAt(i), 0) + 1);
            }
        }
        resultMap.entrySet().removeIf(entry -> entry.getValue() <= 1);
        return resultMap;
    }

    public static void main(String[] args) {
        String message = "Competitive Programming Can Be A Little Bit Tricky!";
        System.out.println(countDuplicateCharacters(message));
    }
}

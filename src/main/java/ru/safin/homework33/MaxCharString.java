package ru.safin.homework33;

import java.util.*;

public class MaxCharString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово или строку (для выхода нажмите \"q\"): ");
        String str = sc.nextLine();
        if (str.equals("q")) {
            return;
        }
        if (!str.isEmpty()) {
            maxCharString(str);
        } else {
            System.out.println("Вы ввели пустую строку!");
        }
    }

    public static void maxCharString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            int value = 1;
            if (map.containsKey(character)) {
                value = map.get(character) + 1;
            }
            map.put(character, value);
        }

        Set<Map.Entry<Character, Integer>> setValue = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = setValue.iterator();
        Map.Entry<Character, Integer> maxChar = null;
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if (maxChar == null) {
                maxChar = entry;
            }
            if (entry.getValue() > maxChar.getValue()) {
                maxChar = entry;
            }
        }

        assert maxChar != null;
        System.out.format("Максимально встречающийся символ в строке: \"%s\", количество повторений: \"%s\"" ,
                maxChar.getKey(), maxChar.getValue());
    }
}

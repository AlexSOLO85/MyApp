package ru.safin.homework25.task01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FilterMap {
    public static void main(String[] args) {
        Map<String, String> personMapOne = mapOne();
        isUnique(personMapOne);
        Map<String, String> personMapTwo = mapTwo();
        isUnique(personMapTwo);
        Map<String, String> personMapThree = mapThree();
        isUnique(personMapTwo);

        System.out.println(personMapOne);
        System.out.printf("Словарь пустой? %s%n", personMapOne.isEmpty());
        System.out.printf("Нет одинаковых значений? %s\n%n", isUnique(personMapOne));

        System.out.println(personMapTwo);
        System.out.printf("Словарь пустой? %s%n", personMapTwo.isEmpty());
        System.out.printf("Нет одинаковых значений? %s\n%n", isUnique(personMapTwo));

        System.out.println(personMapThree);
        System.out.printf("Словарь пустой? %s%n", mapThree().isEmpty());
        System.out.printf("Нет одинаковых значений? %s\n%n", isUnique(personMapThree));
    }

    private static Map<String, String> mapOne() {
        Map<String, String> personMapOne = new HashMap<>();
        personMapOne.put("Вася", "Иванов");
        personMapOne.put("Петр", "Петров");
        personMapOne.put("Виктор", "Сидоров");
        personMapOne.put("Сергей", "Савельев");
        personMapOne.put("Вадим", "Викторов");
        return personMapOne;
    }

    private static Map<String, String> mapTwo() {
        Map<String, String> personMapTwo = new HashMap<>();
        personMapTwo.put("Вася", "Иванов");
        personMapTwo.put("Петр", "Петров");
        personMapTwo.put("Виктор", "Иванов");
        personMapTwo.put("Сергей", "Петров");
        personMapTwo.put("Вадим", "Викторов");
        return personMapTwo;
    }

    private static Map<String, String> mapThree() {
        return new HashMap<>();
    }

    public static boolean isUnique(Map<String, String> map) {
        for (String s : map.values()) {
            if (Collections.frequency(map.values(), s) > 1)
                return false;
        }
        return true;
    }
}

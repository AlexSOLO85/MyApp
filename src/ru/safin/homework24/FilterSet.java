/*
  Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
  public Set<String> removeEvenLength(Set<String> set);
  Например, для множества ["foo", "buzz", "bar", "fork", "bart", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]
 */

package ru.safin.homework24;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FilterSet {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        removeEvenLength(set);
    }

    private static void removeEvenLength(Set<String> set) {
        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bart");
        set.add("spoon");
        set.add("!");
        set.add("dude");
        Iterator<String> iterator = set.iterator();
        System.out.println("Изначальное множество элементов: " + set);
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (temp.length() %2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Множество элементов нечетной длины " + set);
    }
}

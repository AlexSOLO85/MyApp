package ru.safin.task28;

import java.util.Comparator;

public class PersonByName implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        String s1 = p1.getName();
        String s2 = p2.getName();
        return s1.compareTo(s2);
    }
}

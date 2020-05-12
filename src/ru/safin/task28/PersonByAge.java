package ru.safin.task28;

import java.util.Comparator;

public class PersonByAge implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        int pp1 = p1.getAge();
        int pp2 = p2.getAge();
        return Integer.compare(pp1, pp2);
    }
}

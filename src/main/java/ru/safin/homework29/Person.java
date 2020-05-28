package ru.safin.homework29;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private String gender;

    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person personMap = (Person) o;
        return age == personMap.age &&
                name.equals(personMap.name) &&
                gender.equals(personMap.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }

    @Override
    public String toString() {
        return "name = " + getName() + ", gender = " + getGender() + ", age = " + getAge();
    }
}

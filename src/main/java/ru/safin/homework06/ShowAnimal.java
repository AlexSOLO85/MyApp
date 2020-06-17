package ru.safin.homework06;

import static java.lang.System.*;

public class ShowAnimal {
    public static void main(String[] args) {

        Cat cat = new Cat("Том", 3, 20);
        Mouse mouse = new Mouse("Джерри", 3, 5);
        Duck duck = new Duck("Дональд", 5, 10);

        out.println("Имя: " + cat.getName());
        out.println("Имя животного: " + cat.getAnimalName());
        out.println("Возрасть: " + cat.getAge());
        out.println("Высота: " + cat.getHeight());
        out.println(cat.getRun());

        out.println("------------------------");
        out.println("Имя: " + mouse.getName());
        out.println("Имя животного: " + mouse.getAnimalName());
        out.println("Возраст: " + mouse.getAge());
        out.println("Высота: " + mouse.getHeight());
        out.println(mouse.getRun());
        out.println(mouse.getSwim());

        out.println("-------------------------");
        out.println("Имя: " + duck.getName());
        out.println("Имя животного: " + duck.getAnimalName());
        out.println("Возраст: " + duck.getAge());
        out.println("Высота: " + duck.getHeight());
        out.println(duck.getRun());
        out.println(duck.getFly());
        out.println(duck.getSwim());
    }
}

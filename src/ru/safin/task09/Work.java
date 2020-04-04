/*Используя полученные знания об объектно-ориентированном программировании смоделировать какую-нибудь предметную область.
Например: банк, университет, библиотека, склад, магазин, пруд и т.д.
Ограничения:
1. Минимум 3 класса
2. Наличие нескольких полей и методов
3. Использование модификаторов доступа
4. Использование принципов ООП
 */
package ru.safin.task09;

import static java.lang.System.*;

public class Work {
    public static void main(String[] args) {

        Animal cat = new Cat("Том", 3, 20);
        Animal mouse = new Mouse("Джерри", 3, 5);
        Duck duck = new Duck("Дональд", 5, 10);

        out.println("Имя: " + cat.getName());
        out.println("Имя животного: " + cat.getAnimalName());
        out.println("Возрасть: " + ((Cat) cat).getAge());
        out.println("Высота: " + ((Cat) cat).getHeight());
        ((Cat) cat).run();
        out.println("------------------------");
        out.println("Имя: " + mouse.getName());
        out.println("Имя животного: " + mouse.getAnimalName());
        out.println("Возраст: " + ((Mouse) mouse).getAge());
        out.println("Высота: " + ((Mouse) mouse).getHeight());
        ((Mouse) mouse).run();
        ((Mouse) mouse).swim();
        out.println("-------------------------");
        out.println("Имя: " + duck.getName());
        out.println("Имя животного: " + duck.getAnimalName());
        out.println("Возраст: " + duck.getAge());
        out.println("Высота: " + duck.getHeight());
        duck.fly();
        duck.run();
        duck.swim();
        out.println("*************************");

        boolean isMouse = cat instanceof Mouse;
        out.println("Том это мышь? " + isMouse);
        boolean isCat = cat instanceof Cat;
        out.println("Том это кошка? " + isCat);
        boolean isDuck = cat instanceof Duck;
        out.println("Том это утка? " + isDuck);
        boolean isAnimal = cat instanceof Animal;
        out.println("Том это животное? " + isAnimal);
        out.println("------------------------");
        boolean IsMouse = mouse instanceof Mouse;
        out.println("Джерри это мышь? " + IsMouse);
        boolean IsCat = mouse instanceof Cat;
        out.println("Джерри это кошка? " + IsCat);
        boolean IsDuck = mouse instanceof Duck;
        out.println("Джерри это утка? " + IsDuck);
        boolean IsAnimal = mouse instanceof Animal;
        out.println("Джерри это животное? " + IsAnimal);
    }
}

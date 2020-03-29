/*Используя полученные знания об объектно-ориентированном программировании смоделировать какую-нибудь предметную область.
Например: банк, университет, библиотека, склад, магазин, пруд и т.д.
Ограничения:
1. Минимум 3 класса
2. Наличие нескольких полей и методов
3. Использование модификаторов доступа
4. Использование принципов ООП
 */
package ru.safin.task09;

public class Work {
    public static void main(String[] args) {

        Animal cat = new Cat("Том", 3, 20);
        Animal mouse = new Mouse("Джерри", 3, 5);

        System.out.println("Имя: " + cat.getName());
        System.out.println("Имя животного: " + cat.getAnimalName());
        System.out.println("Возрасть: " + ((Cat) cat).getAge());
        System.out.println("Высота: " + ((Cat) cat).getHeight());
        System.out.println("------------------------");
        System.out.println("Имя: " + mouse.getName());
        System.out.println("Имя животного: " + mouse.getAnimalName());
        System.out.println("Возраст: " + ((Mouse) mouse).getAge());
        System.out.println("Высота: " + ((Mouse) mouse).getHeight());
        System.out.println("------------------------");

        boolean isMouse = cat instanceof Mouse;
        System.out.println("Том это мышь? " + isMouse);
        boolean isCat = cat instanceof Cat;
        System.out.println("Том это кошка? " + isCat);
        boolean isAnimal = cat instanceof Animal;
        System.out.println("Том это животное? " + isAnimal);
        System.out.println("------------------------");
        boolean IsMouse = mouse instanceof Mouse;
        System.out.println("Джерри это мышь? " + IsMouse);
        boolean IsCat = mouse instanceof Cat;
        System.out.println("Джерри это кошка? " + IsCat);
        boolean IsAnimal = mouse instanceof Animal;
        System.out.println("Джерри это животное? " + IsAnimal);
    }
}

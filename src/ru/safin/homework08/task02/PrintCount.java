/*
  Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
  Написать метод для получения информации о количестве.
 */

package ru.safin.homework08.task02;

public class PrintCount {
    public static void main(String[] args) {
        Count Object_01 = new Count();
        System.out.println("Создано объектов: " + Count.count);

        Count Object_02 = new Count();
        System.out.println("Создано объектов: " + Count.count);

        Count Object_03 = new Count();
        System.out.println("Создано объектов: " + Count.count);
    }
}

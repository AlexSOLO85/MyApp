/**
 * Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
 * Написать метод для получения информации о количестве.
 */

package ru.safin.task12;

public class Count {
    public static void main(String[] args) {
        Variable Object_01 = new Variable();
        System.out.println("Создано объектов: " + Variable.count);

        Variable Object_02 = new Variable();
        System.out.println("Создано объектов: " + Variable.count);

        Variable Object_03 = new Variable();
        System.out.println("Создано объектов: " + Variable.count);
    }
}

class Variable {
    static int count;
    Variable() {
        count++;
    }
}

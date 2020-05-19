/*
  Есть набор объектов типа "Книга". Каждая книга имеет название, автора, год издания. Можно больше, по желанию.
  Программа должна уметь:
  1. добавлять книгу в библиотеку.
  2. показывать список книг в библиотеке.
  3. восстанавливать содержимое библиотеки после перезапуска.
  4. показывать соответствующее сообщение в случае ошибок.
  Важно!
  1. потоки обязательно должны закрываться
  2. отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки
 */

package ru.safin.homework17;

import java.util.*;

public class HomeLibrary {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String e;
            boolean p = true;
            while (p) {
                BookLibrary.helpMenu();
                System.out.println("Вернуться к исходному выбору? \"y\" - Да, \"n\" - Нет");
                e = sc.next();
                p = e.equalsIgnoreCase("y");
            }
        }
        catch (InputMismatchException e) {
            System.err.println("Введен не ответ. Программа закрыта!");
        }
    }
}

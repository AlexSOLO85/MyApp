/*
  Реализовать программу «Вендинговый автомат», которая позволит:
  1. Посмотреть меню напитков
  2. Внести деньги на внутренний счет
  3. Выбрать номер напитка и получить его, если на счету достаточно средств.
  Программа должна обрабатывать следующие ситуации:
  1. Пользователь не внес деньги
  2. Пользователь выбрал более дорогой напиток, чем внесено денег
  3. Пользователь выбрал несуществующий номер напитка
  Для хранения напитков предлагается использовать массив с enum. У напитка должна быть цена и название.
  upd:
  Добавить в программу "Вендинговый автомат" журналирование событий, при этом стоит указать различные уровни логирования,
  как информационного уровня, так и предупреждения и ошибки.
  Настроить сбор логов в файл.
  Фреймворк логирования - на ваш выбор.
*/

package ru.safin.homework07;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachine {

    private final static Logger logger = LogManager.getLogger(VendingMachine.class);

    public static void main(String[] args) {

        logger.info("Приложение запущено");

        System.out.println("Торговый автомат");
        System.out.println("----------------");
        System.out.println("Меню напитков:");

        MenuProduct.menu();

        System.out.println("Выберите напиток");

        Scanner sc = new Scanner(System.in);
        try {
            int i = sc.nextInt();
            SelectionProduct.variableProduct(i);
            }
            catch (InputMismatchException e) {
                System.err.println("Вы ввели не число!");
                logger.error("Пользователь ввел не числовое значение: " + e.getMessage());
        }
        finally {
            System.err.println("Завершение работы программы!");
        }
    }
}
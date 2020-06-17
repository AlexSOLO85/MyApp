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
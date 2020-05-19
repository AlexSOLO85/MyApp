package ru.safin.homework07;

import org.apache.log4j.Logger;
import java.util.Scanner;

public class SelectionProduct {

    private final static Logger logger = Logger.getLogger(SelectionProduct.class);

    public static void variableProduct(int i){

        Product prod = ChangeProduct.getSelected(i);

        try {
            if (prod != null) {
                System.out.println("Выбран напиток: " + prod.getName() + " Цена: " + prod.getPrice());
                System.out.println("Внесите деньги");

                Scanner sc = new Scanner(System.in);

                double cash = sc.nextInt();

                if (cash < prod.getPrice()) {
                    System.out.println("Недостаточно денег");
                    System.out.println("Возврат денег " + cash);
                    logger.warn("Пользователем внесено недостаточно денег. Возврат денег: " + cash);
                }
                if (cash == prod.getPrice()) {
                    System.out.println("Заберите напиток");
                }
                if (cash > prod.getPrice()) {
                    double out = cash - prod.getPrice();
                    System.out.println("Заберите напиток " + "Сдача " + out);
                }
            } else {
                throw new AssertionError();
            }
        }
        catch (AssertionError e) {
            System.err.println("Выбор такого напитка отсутствует!");
            logger.error("Выбор такого напитка отсутствует: " + e.getMessage());
        }
    }
}

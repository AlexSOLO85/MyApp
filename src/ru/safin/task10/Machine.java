/*Реализовать программу «Вендинговый автомат», которая позволит:
1. Посмотреть меню напитков
2. Внести деньги на внутренний счет
3. Выбрать номер напитка и получить его, если на счету достаточно средств.
Программа должна обрабатывать следующие ситуации:
1. Пользователь не внес деньги
2. Пользователь выбрал более дорогой напиток, чем внесено денег
3. Пользователь выбрал несуществующий номер напитка
Для хранения напитков предлагается использовать массив с enum. У напитка должна быть цена и название.
*/
package ru.safin.task10;

import java.util.Scanner;

import static ru.safin.task10.Product.COFFEE;
import static ru.safin.task10.Product.TEA;

public class Machine {
    public static void main(String[] args) {

        System.out.println("Торговый автомат");
        System.out.println("----------------");
        System.out.println("Меню напитков:");

        System.out.println("1. Напиток: " + TEA.getName() + " Цена: " + TEA.getPrice());
        System.out.println("2. Напиток: " + COFFEE.getName() + " Цена: " + COFFEE.getPrice());

        System.out.println("Выберите напиток");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Выбран напиток: " + TEA.getName() + " Цена: " + TEA.getPrice());
                System.out.println("Внесите деньги");
                i = sc.nextInt();
                if (i < TEA.getPrice()) System.out.println("Недостаточно денег");{
                    System.out.println("Возврат денег " + i);
                }
                if (i == TEA.getPrice()) System.out.println("Заберите напиток");
                if (i > TEA.getPrice()) {
                    int o = i - TEA.getPrice();
                    System.out.println("Заберите напиток " + "Сдача " + o);
                }
                break;
            case 2:
                System.out.println("Выбран напиток: " + COFFEE.getName() + " Цена: " + COFFEE.getPrice());
                System.out.println("Внесите деньги");
                i = sc.nextInt();
                if (i < COFFEE.getPrice()) System.out.println("Недостаточно денег");{
                System.out.println("Возврат денег " + i);
                }
                if (i == COFFEE.getPrice()) System.out.println("Заберите напиток");
                if (i > COFFEE.getPrice()) {
                    int o = i - COFFEE.getPrice();
                    System.out.println("Заберите напиток " + "Сдача " + o);
                }
                break;
            default:
                System.out.println("Нет такого напитка!");
                break;
        }
    }
}
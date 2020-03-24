/*Игра «горячо-холодно»
Создать консольное Java-приложение «Горячо-Холодно»
1. Вначале программа «загадывает» случайное число от 1 до 100.
2. Пользователь вводит с консоли число.
3. Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно»,
   И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее.
4. Для первого ввода пользователя считаем предыдущим введенным числом 0.
5. Предусмотреть возможность выхода из игры до отгадывания числа
 */
package ru.safin.task04;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int comp, user, count = 0;
        do{
            comp = (int)(Math.random()*100+1);
        }
        while(comp == 0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число из отрезка от 1 до 100");
        if(sc.hasNextInt()){
            do{
                user = sc.nextInt();
                if(user < 0||user == 0 || user > 100){
                    System.out.println("Вы ввели число не из заданного диапазона или 0");
                    System.out.println("Повторите ввод");
                }
                else{
                    ++count;
                    if(user == comp){
                        System.out.println("Вы угадали с "+count+" попытки");
                    }
                    else{
                        if(user < comp)
                        System.out.println("Число больше");
                        else System.out.println("Число меньше");
                    }
                }
            }
            while(user!=comp);
        }
        else System.out.println("Ошибка. Введено не целое число");
    }
}

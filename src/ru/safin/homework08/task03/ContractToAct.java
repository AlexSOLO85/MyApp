/*
  Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
  Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
 */

package ru.safin.homework08.task03;

public class ContractToAct {
    public static void main(String[] args) {
        Contract contract = new Contract(40, "20.02.2010", "Товары");
        Act act = Convert.conversation(contract);
    }
}

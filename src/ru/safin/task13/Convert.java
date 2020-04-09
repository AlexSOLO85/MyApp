package ru.safin.task13;

import java.util.Arrays;

public class Convert {
    public static void conversation() {
        Contract contract = new Contract();
        Act act = new Act();

        int numberContract = contract.getNumber();
        act.setNumber(numberContract);
        int numberAct = act.setNumber(numberContract);

        String dateContract = contract.getDate();
        act.setDate(dateContract);
        String numberDate = act.setDate(dateContract);

        String nameContract = Arrays.toString(contract.getName());
        String nameAct = Arrays.toString(act.setArray(contract.getName()));

        System.out.println("Номер договора: " + numberContract);
        System.out.println("Дата договора: " + dateContract);
        System.out.println("Наименование товаров договора: " + nameContract);
        System.out.println("----------------------------------------------");
        System.out.println("Номер акта: " + numberAct);
        System.out.println("Дата акта: " + numberDate);
        System.out.println("Наименование товаров акта: " + nameAct);
    }
}

package ru.safin.task13;

import java.util.Arrays;

public class Convert {
    public static Act conversation(Contract contract){
        Act act = new Act();
        act.number = contract.number;
        act.date = contract.date;
        act.name = contract.name;
        System.out.println(act.number);
        System.out.println(act.date);
        System.out.println(Arrays.toString(act.name));

        return act;
    }
}

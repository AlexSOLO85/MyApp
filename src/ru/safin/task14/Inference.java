package ru.safin.task14;

import static java.lang.System.*;

public class Inference {
    public static void main(String[] args) {

        Amateur amateur = new Amateur("Борис", 180, 25);
        Sportsman sportsman = new Sportsman("Иван", 190, 27);

        out.println(amateur.getHumanName() + ", " + amateur.getSportsman());
        out.println("Имя: " + amateur.getName());
        out.println("Рост: " + amateur.getHeight());
        out.println("Возраст: " + amateur.getAge());
        out.println(amateur.runSlowly());
        out.println(amateur.swimSlowly());

        out.println("****************************");

        out.println(sportsman.getHumanName() + ", " + sportsman.getSportsman());
        out.println("Имя: " + sportsman.getName());
        out.println("Рост: " + sportsman.getHeight());
        out.println("Возраст: " + sportsman.getAge());
        out.println(sportsman.runFast());
        out.println(sportsman.swimFast());
    }
}

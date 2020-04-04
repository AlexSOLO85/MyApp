package ru.safin.task14;

public class Sportsman extends Human implements Run, Swim {
    private int height;
    private int age;

    public Sportsman(String name, int height, int age) {
        super(name);
        this.height = height;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void run() {
        Run.runFast();
    }

    public void swim() {
        Swim.swimFast();
    }

    @Override
    public String getHumanName() {
        return "Человек";
    }

    @Override
    public String getSportsman() {
        return "Профессиональный спортсмен";
    }
}

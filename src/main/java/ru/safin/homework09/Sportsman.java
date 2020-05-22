package ru.safin.homework09;

public class Sportsman extends Human {
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

    @Override
    public String getHumanName() {
        return "Человек";
    }

    @Override
    public String getSportsman() {
        return "Профессиональный спортсмен";
    }
}

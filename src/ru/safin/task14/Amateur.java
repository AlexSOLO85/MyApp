package ru.safin.task14;

public class Amateur extends Human {
    private int height;
    private int age;

    public Amateur(String name, int height, int age) {
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
        return "Спортсмен любитель";
    }
}

package ru.safin.task09;

public class Duck extends Animal implements Fly, Run, Swim {
    private int age;
    private int height;

    public Duck(String name, int age, int height) {
        super(name);
        this.age = age;
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getAnimalName() {
        return "Утка";
    }

    @Override
    public String getRun() {
        return "Class Duck Run";
    }

    @Override
    public String getFly() {
        return "Class Duck Fly";
    }

    @Override
    public String getSwim() {
        return "Class Duck Swim";
    }
}

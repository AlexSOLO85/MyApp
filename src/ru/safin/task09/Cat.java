package ru.safin.task09;

public class Cat extends Animal implements Run {
    private int age;
    private int height;

    public Cat(String name, int age, int height) {
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
        return "Кошка";
    }

    @Override
    public String getRun() {
        return "Class Cat Run";
    }
}

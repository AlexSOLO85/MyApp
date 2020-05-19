package ru.safin.homework06;

public class Mouse extends Animal implements ImplRun, ImplSwim {
    private int age;
    private int height;

    public Mouse(String name, int age, int height) {
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
        return "Мышь";
    }

    @Override
    public String getRun() {
        return "Class Mouse Run";
    }

    @Override
    public String getSwim() {
        return "Class Mouse Swim";
    }
}

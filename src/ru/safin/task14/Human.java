package ru.safin.task14;

public abstract class Human implements Run, Swim {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String runFast() {
        return ("Бегает быстро");
    }

    @Override
    public String runSlowly() {
        return ("Бегает медленно");
    }

    @Override
    public String swimFast() {
        return ("Плавает быстро");
    }

    @Override
    public String swimSlowly() {
        return ("Плавет медленно");
    }

    public abstract String getHumanName();

    public abstract String getSportsman();

}

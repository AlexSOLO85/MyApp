package ru.safin.task14;

public abstract class Human implements Run, Swim {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getHumanName();

    public abstract String getSportsman();
}

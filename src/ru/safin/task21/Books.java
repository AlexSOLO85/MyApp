package ru.safin.task21;

public class Books {

    private String name;
    private final String author;
    private final int year;

    public Books(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}


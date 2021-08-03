package ru.brown.chapters.page223.use_of_protected;

public class Goody {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Goody(String name) {
        this.name = name;
    }

    public String toString() {
        return "Я объект Goody и мое имя " + name;
    }

}

package ru.brown.chapters.CollectionsObjects_Chapter11.page336ex6;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String toString() {
        return getClass().getSimpleName() +
                (name == null ? "" : " " + name);
    }
}

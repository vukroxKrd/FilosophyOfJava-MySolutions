package ru.brown.chapters.CollectionsObjects_Chapter11.page326;

public class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }

}

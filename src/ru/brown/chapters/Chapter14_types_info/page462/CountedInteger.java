package ru.brown.chapters.Chapter14_types_info.page462;

public class CountedInteger {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return Long.toString(id);
    }
}


package ru.brown.chapters.Interfaces.page271version2.filters;

public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform" + id;
    }
}



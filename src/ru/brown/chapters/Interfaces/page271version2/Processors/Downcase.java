package ru.brown.chapters.Interfaces.page271version2.Processors;

public class Downcase extends StringProcessor {
    @Override
    public String name() {
        return ("Downcase");
    }

    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
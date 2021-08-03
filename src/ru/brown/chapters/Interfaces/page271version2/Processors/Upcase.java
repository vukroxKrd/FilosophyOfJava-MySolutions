package ru.brown.chapters.Interfaces.page271version2.Processors;

public class Upcase extends StringProcessor {
    @Override
    public String name() {
        return ("Upcase");
    }

    public String process(Object input) {
        //Ковариантныйвозвращаемыйтип
        return ((String) input).toUpperCase();
    }
}

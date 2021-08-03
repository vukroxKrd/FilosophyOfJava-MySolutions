package ru.brown.chapters.Interfaces.page271;

class Downcase implements Processor {
    @Override
    public String name() {
        return ("Downcase");
    }

    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
package ru.brown.chapters.Interfaces.page271;

import java.util.Arrays;

class Upcase implements Processor {
    @Override
    public String name() {
        return ("Upcase");
    }

    public String process(Object input) {
        //Ковариантныйвозвращаемыйтип
        return ((String) input).toUpperCase();
    }
}

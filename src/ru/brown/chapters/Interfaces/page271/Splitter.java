package ru.brown.chapters.Interfaces.page271;

import java.util.Arrays;

class Splitter implements Processor {
    @Override
    public String name() {
        return ("Splitter");
    }

    public String process(Object input) {
        //Аргумент split() используется для разбиения строки
        return Arrays.toString(((String) input).split(" "));
    }
}
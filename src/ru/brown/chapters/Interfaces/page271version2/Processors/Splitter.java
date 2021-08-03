package ru.brown.chapters.Interfaces.page271version2.Processors;

import java.util.Arrays;

public class Splitter extends StringProcessor {
    @Override
    public String name() {
        return ("Splitter");
    }

    public String process(Object input) {
        //Аргумент split() используется для разбиения строки
        return Arrays.toString(((String) input).split(" "));
    }
}
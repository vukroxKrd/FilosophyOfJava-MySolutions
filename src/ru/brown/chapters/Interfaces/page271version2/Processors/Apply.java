package ru.brown.chapters.Interfaces.page271version2.Processors;

import ru.brown.chapters.Interfaces.page271version2.Processor;

public class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("Используем Processor " + p.name());
        System.out.println(p.process(s));
    }
}

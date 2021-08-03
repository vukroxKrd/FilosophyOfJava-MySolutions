package ru.brown.chapters.Interfaces.page271version2.Processors;

import ru.brown.chapters.Interfaces.page271version2.Processor;

public abstract class StringProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

}

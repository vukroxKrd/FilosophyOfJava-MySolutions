package ru.brown.chapters.Interfaces.page271version2.filters;


import ru.brown.chapters.Interfaces.page271version2.*;

public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    public String name() {
        return filter.name();
    }

    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

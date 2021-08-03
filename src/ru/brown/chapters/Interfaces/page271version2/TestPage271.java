package ru.brown.chapters.Interfaces.page271version2;

import ru.brown.chapters.Interfaces.page271version2.Processors.*;
import ru.brown.chapters.Interfaces.page271version2.filters.*;

public class TestPage271 {
    public static void main(String[] args) {
        String s = "If she weighs the same as a duck, she's made of wood";
//        String s = "Dolary";

        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
        Apply.process(new Turnover(), s);

//        Waveform w = new Waveform();
//        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
//        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
//        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);

    }
}


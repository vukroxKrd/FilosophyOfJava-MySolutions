package ru.brown.chapters.Interfaces.page271version2.filters;

public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input; // Фиктивная обработка
    }
}



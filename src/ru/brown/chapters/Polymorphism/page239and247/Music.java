package ru.brown.chapters.Polymorphism.page239and247;

public class Music {
    public static void tune(Instrument instrument){
        if (instrument instanceof Wind) {
            instrument.play(Note.DO);
        } else if (instrument instanceof Stringed){
            instrument.play(Note.RE);
        } else if (instrument instanceof Brass){
            instrument.play(Note.MI);
        }
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass horn = new Brass();

        tune(flute);
        tune(violin);
        tune(horn);
    }
}

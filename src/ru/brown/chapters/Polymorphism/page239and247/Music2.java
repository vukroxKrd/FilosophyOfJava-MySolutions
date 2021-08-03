package ru.brown.chapters.Polymorphism.page239and247;

public class Music2 {
    public static void tune(Wind wind){
        wind.play(Note.RE);
    }

    public static void tune(Stringed guitar){
        guitar.play(Note.MI);
    }

    public static void tune(Brass trumpet){
        trumpet.play(Note.FA);
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

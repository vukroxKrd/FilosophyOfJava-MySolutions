package ru.brown.chapters.Polymorphism.page239and247;

public class Wind extends Instrument {

    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

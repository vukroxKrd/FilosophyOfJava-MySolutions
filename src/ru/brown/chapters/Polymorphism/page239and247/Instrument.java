package ru.brown.chapters.Polymorphism.page239and247;

public class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        System.out.println("Adjuting intrument");
    }

    @Override
    public String toString() {
        return what();
    }
}

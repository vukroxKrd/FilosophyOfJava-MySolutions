package ru.brown.chapters.Polymorphism.page239and247;

public class Stringer extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringer plays " + n);
    }

    @Override
    String what() {
        return "Stringer";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting stringer");
    }
}

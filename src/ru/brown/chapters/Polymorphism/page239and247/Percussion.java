package ru.brown.chapters.Polymorphism.page239and247;

public class Percussion extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Percussion plays "+ n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting percussion");;
    }
}

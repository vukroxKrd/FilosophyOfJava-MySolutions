package ru.brown.chapters.Polymorphism.page239and247;

public class Stringed extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play "+ n);
    }
}

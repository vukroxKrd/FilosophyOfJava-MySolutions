package ru.brown.chapters.Polymorphism.page239and247;

public class Brass extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play " + n);
    }

    String what() {
        return "Brass";
    }
}

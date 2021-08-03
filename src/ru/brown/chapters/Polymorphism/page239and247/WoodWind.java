package ru.brown.chapters.Polymorphism.page239and247;

public class WoodWind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("WoodWind plays " + n);
    }

    @Override
    String what() {
        return "WoodWind";
    }
}

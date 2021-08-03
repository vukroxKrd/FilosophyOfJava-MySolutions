package ru.brown.chapters.Interfaces.page287_factory_m2;

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

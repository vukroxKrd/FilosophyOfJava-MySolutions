package ru.brown.chapters.Interfaces.page287_factory_m2;

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}


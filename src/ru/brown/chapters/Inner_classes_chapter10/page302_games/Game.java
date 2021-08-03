package ru.brown.chapters.Inner_classes_chapter10.page302_games;

import ru.brown.chapters.util.Print;

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private Checkers() {
    }

    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        Print.print("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {
    private Chess() {
    }

    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        Print.print("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Chess();
        }
    };
}
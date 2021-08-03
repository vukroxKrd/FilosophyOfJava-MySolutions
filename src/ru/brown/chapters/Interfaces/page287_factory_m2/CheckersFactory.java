package ru.brown.chapters.Interfaces.page287_factory_m2;

class CheckersFactory implements GameFactory {
    public Game getGame() { return new Checkers(); }
}


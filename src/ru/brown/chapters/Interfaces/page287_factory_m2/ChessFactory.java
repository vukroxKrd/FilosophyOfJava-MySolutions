package ru.brown.chapters.Interfaces.page287_factory_m2;

class ChessFactory implements GameFactory {
    public Game getGame() { return new Chess(); }
}


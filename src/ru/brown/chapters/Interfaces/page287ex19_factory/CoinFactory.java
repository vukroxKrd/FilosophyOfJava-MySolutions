package ru.brown.chapters.Interfaces.page287ex19_factory;

public class CoinFactory implements CastableFactory{
    @Override
    public Castable getCastable() {
        return new Coin();
    }

    @Override
    public Castable getCastable(int castTimes) {
        return new Coin(castTimes);
    }
}

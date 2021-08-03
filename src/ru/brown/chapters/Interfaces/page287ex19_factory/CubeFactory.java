package ru.brown.chapters.Interfaces.page287ex19_factory;

public class CubeFactory implements CastableFactory{

    @Override
    public Castable getCastable() {
        return new Cube();
    }

    @Override
    public Castable getCastable(int castTimes) {
        return  new Cube(castTimes);
    }
}

package ru.brown.chapters.Interfaces.page287ex18_factory_with_cycles;

interface CycleFactory {
    Cycle getCycle();
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}
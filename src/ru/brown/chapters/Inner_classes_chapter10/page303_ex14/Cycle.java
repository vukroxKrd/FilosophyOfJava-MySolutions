package ru.brown.chapters.Inner_classes_chapter10.page303_ex14;

import ru.brown.chapters.util.Print;

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    private Unicycle() { Print.print("Unicycle()"); }
    public void ride() { Print.print("Ride Unicycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Unicycle(); }
            };
}

class Bicycle implements Cycle {
    private Bicycle() { Print.print("Bicycle()"); }
    public void ride() { Print.print("Ride Bicycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Bicycle(); }
            };
}

class Tricycle implements Cycle {
    private Tricycle() { Print.print("Tricycle()"); }
    public void ride() { Print.print("Ride Tricycle"); }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Tricycle(); }
            };
}

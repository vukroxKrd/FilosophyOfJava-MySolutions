package ru.brown.chapters.Inner_classes_chapter10.page303_ex14;

public class Cycles {
    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.ride();
    }
    public static void main(String [] args) {
        rideCycle(Unicycle.factory);
        rideCycle(Bicycle.factory);
        rideCycle(Tricycle.factory);
    }
}
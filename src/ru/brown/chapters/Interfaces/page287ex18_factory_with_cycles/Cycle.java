package ru.brown.chapters.Interfaces.page287ex18_factory_with_cycles;


interface Cycle {
    void ride();
}
class Bicycle implements Cycle {
    public void ride() { System.out.println("Ride Bicycle"); }
}

class Unicycle implements Cycle {
    public void ride() {
        System.out.println("Ride Unicycle"); }

}






class Tricycle implements Cycle {
    Tricycle() { System.out.println("Tricycle()"); }
    public void ride() { System.out.println("Ride Tricycle"); }
}




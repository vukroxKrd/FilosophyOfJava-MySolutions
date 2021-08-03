package ru.brown.chapters.Polymorphism.page254;

public class Rodent {

    private String name = "Rodent";
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    private Characteristic c = new Characteristic("has tail");
    private Description d = new Description("small mammal");

    Rodent(Shared shared) {
        System.out.println("Rodent() " + id);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void eat() { System.out.println("Rodent.eat()"); }
    protected void run() { System.out.println("Rodent.run()"); }
    protected void sleep() { System.out.println("Rodent.sleep()"); }
    public String toString() { return name + " " + id; }
}

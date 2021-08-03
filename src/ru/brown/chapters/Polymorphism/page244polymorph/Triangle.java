package ru.brown.chapters.Polymorphism.page244polymorph;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void color() {
        System.out.println("Traiangle is colored");
    }
}

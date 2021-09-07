package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;

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

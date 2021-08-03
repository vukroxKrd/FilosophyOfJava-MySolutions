package ru.brown.chapters.Polymorphism.page244polymorph;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

    @Override
    public void erase() {
        System.out.println("Square.eraseQ");
    }

    @Override
    public void color() {
        System.out.println("Square is colored");
    }
}
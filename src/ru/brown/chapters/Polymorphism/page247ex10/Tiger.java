package ru.brown.chapters.Polymorphism.page247ex10;

public class Tiger extends Cat{

    public void wash() {
        lick();
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.wash();
    }
}

package ru.brown.chapters.Inner_classes_chapter10.page309.ex21;

public class Ex21 {
    public static void main(String[] args) {

        A a0 = new A();
        A a1 = new A();
        A a2 = new A();

        B b = new B(3);

        b.addU(a0.buildU(), 0);
        b.addU(a1.buildU(), 1);
        b.addU(a2.buildU(), 2);
        b.showUs();
        b.testUs();
        b.eraseU(0);
        b.eraseU(1);
        b.showUs();
    }
}
package ru.brown.chapters.Inner_classes_chapter10.page310_closure;

public class MyIncrement {
    void increment() {
        System.out.println("Другая операция");
    }

    public static void f(MyIncrement mi) {
        mi.increment();
    }
}

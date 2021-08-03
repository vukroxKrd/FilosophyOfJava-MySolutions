package ru.brown.chapters.Inner_classes_chapter10.page310_closure;

public class Callee1 implements Incrementable {
    private int i = 0;

    public void increment() {
        i++;
        System.out.println(i);
    }
}

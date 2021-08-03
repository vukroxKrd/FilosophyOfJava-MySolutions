package ru.brown.chapters.inner_classes.page299modelling_constructor;

abstract class Base {
    public Base(int i) {
        System.out.println("Base конструктор, i = " + i);
    }
    public abstract void f();
}
package ru.brown.chapters.Inner_classes_chapter10.page310_closure;

public class Callbacks {
    public static void main(String[] args) {
        Callee1 cl = new Callee1();
        Callee2 c2 = new Callee2();
        Calee3 c3 = new Calee3();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(cl);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
        c3.increment();
    }
}

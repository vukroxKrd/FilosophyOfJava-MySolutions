package ru.brown.chapters.page231.private_and_final;

public class OverridingPrivate extends WithFinals {

    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }

    @Override
    void h() {
        super.h();
    }
}
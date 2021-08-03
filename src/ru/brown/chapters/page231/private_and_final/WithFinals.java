package ru.brown.chapters.page231.private_and_final;

public class WithFinals {
    // То же, что и просто private:
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    // Также автоматически является final:
    private void g() {
        System.out.println("WithFinals.g()");
    }

    void h() {
        System.out.println("WithFinal.g()");
    }
}


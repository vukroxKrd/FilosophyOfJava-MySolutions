package ru.brown.chapters.page231.private_and_final;

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // Можно провести восходящее преобразование:
        OverridingPrivate op = op2;
        // Но методы при этом вызвать невозможно:
//        ! op.f();
//        ! op.g();
        // И то же самое здесь:
        WithFinals wf = op2;
//        wf.f();
//        wf.g();
        OverrideFinal of = new OverrideFinal();
        WithFinals withFinals = of;
        withFinals.h();
    }
}
/* Output:
0verridingPrivate2.f()
0verridingPrivate2.g()
*/

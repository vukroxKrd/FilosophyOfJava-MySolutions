package ru.brown.chapters.Inner_classes_chapter10.page319_overriding_inner_classes;

import ru.brown.chapters.util.Print;

class Egg2 {

    protected class Yolk {
        public Yolk() {
            Print.print("Egg2.Yolk()");
        }
        public void f() {
            Print.print("Egg2.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();

    public Egg2() {
        Print.print("New Egg2()");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }
}


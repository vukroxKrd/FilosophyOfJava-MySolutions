package ru.brown.chapters.Inner_classes_chapter10.page309.ex21;

class A {
    U buildU() {
        return new U() {
            public void f() { System.out.println("f()"); }
            public void g() { System.out.println("g()"); }
            public String toString() { return "I'm a U"; }
        };
    }
}


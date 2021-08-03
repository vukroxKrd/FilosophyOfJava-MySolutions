package ru.brown.chapters.Inner_classes_chapter10.page309.ex21;

class B {
    private U[] us;

    B(int i) {
        us = new U[i];
    }
    void addU(U u, int i) {
        us[i] = u;
    }
    void eraseU(int i) {
        us[i] = null;
    }
    void testUs() {
        for(U u : us) {
            u.f();
            u.g();
            u.toString();
        }
    }
    void showUs() {
        for(U u : us) {
            if(u != null) System.out.println(u.toString());
            else System.out.println("I'm null");
        }
    }
}
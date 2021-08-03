package ru.brown.chapters.inner_classes.page299modelling_constructor;

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {System.out.println("B инициализаторе экземпляра"); }
            public void f() {System.out.println("B анонимном f()"); }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}

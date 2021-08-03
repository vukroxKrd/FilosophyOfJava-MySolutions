package ru.brown.chapters.Polymorphism.page247prive_overload;

public class PrivateOverride {
    private void f() {
        System.out.println("privatef()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

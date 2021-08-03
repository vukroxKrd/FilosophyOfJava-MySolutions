package ru.brown.chapters.inner_classes.page301_factory;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        // Реализации полностью взаимозаменяемы:
        serviceConsumer(Implementation2.factory);
    }
}
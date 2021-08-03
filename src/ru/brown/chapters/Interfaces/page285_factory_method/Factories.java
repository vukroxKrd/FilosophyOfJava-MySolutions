package ru.brown.chapters.Interfaces.page285_factory_method;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        // Реализации полностью взаимозаменяемы:
        serviceConsumer(new Implementation2Factory());
    }
}
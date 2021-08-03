package ru.brown.chapters.Interfaces.page285_factory_method;

class Implementation1 implements Service {
    Implementation1() {
    } // Доступ в пределах пакета

    public void method1() {
        System.out.println("Implementation1 method1");
    }
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}
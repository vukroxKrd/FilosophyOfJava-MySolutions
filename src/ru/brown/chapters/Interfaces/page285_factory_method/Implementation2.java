package ru.brown.chapters.Interfaces.page285_factory_method;

class Implementation2 implements Service {
    Implementation2() {} // Доступ в пределах пакета
    public void method1 () {
        System.out.println("Implementation2 method1");
    }
    public void method2 () {
        System.out.println("Implementation2 method2");
    }
}
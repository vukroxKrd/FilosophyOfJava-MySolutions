package ru.brown.chapters.inner_classes.page301_factory;

import ru.brown.chapters.util.Print;

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    private Implementation1() {
    }

    public void method1() {
        Print.print("Implementation1 method1");
    }
    public void method2() {
        Print.print("Implementation1 method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getService() {
                    return new Implementation1();
                }
            };
}

class Implementation2 implements Service {
    private Implementation2() {
    }

    public void method1() {
        Print.print("Implementation2 methodl");
    }
    public void method2() {
        Print.print("Implementation2 method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getService() {
                    return new Implementation2();
                }
            };
}


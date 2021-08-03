package ru.brown.chapters.Interfaces.page285_factory_method;

class Implementation1Factory implements ServiceFactory {
    public Service getService() {
        return new Implementation1();
    }
}
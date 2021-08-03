package ru.brown.chapters.Interfaces.page285_factory_method;

class Implementation2Factory implements ServiceFactory {
    public Service getService() {
        return new Implementation2();
    }
}
package ru.brown.chapters.Inner_classes_chapter10.page310_closure;

class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable ссылкаДляОбратногоВызова) {
        callbackReference = ссылкаДляОбратногоВызова;
    }

    void go() {
        callbackReference.increment();
    }
}

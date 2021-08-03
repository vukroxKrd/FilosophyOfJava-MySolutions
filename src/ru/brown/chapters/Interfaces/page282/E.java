package ru.brown.chapters.Interfaces.page282;

interface E {
    interface G {
        void f();
    }

    // Избыточное объявление public:
    interface H {
        void f();
    }

    void g();
// Не может быть private внутри интерфейса:
// private interface I {}
}

package ru.brown.chapters.Exceptions_Chapter12.page373ex5__model_resumer;

class ResumerException extends Exception {
}

class Resumer {
    static int count = 3;
    static void f() throws ResumerException {
        if (--count > 0)
            throw new ResumerException();
    }
}
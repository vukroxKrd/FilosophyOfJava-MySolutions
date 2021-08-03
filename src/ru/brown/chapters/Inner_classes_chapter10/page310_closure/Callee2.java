package ru.brown.chapters.Inner_classes_chapter10.page310_closure;

import ru.brown.chapters.util.Print;

// Если ваш класс должен вызывать метод increment()
// по-другому> необходимо использовать внутренний класс:
class Callee2 extends MyIncrement {
    private int i = 0;

    protected void increment() {
        super.increment();
        i++;
        Print.print(i);
    }

    private class Closure implements Incrementable {
        public void increment() {
            // Указывается метод внешнего класса> иначе
            // возникнет бесконечная рекурсия:
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }
}
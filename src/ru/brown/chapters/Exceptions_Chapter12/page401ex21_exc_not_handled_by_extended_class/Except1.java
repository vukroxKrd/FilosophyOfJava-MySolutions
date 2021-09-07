package ru.brown.chapters.Exceptions_Chapter12.page401ex21_exc_not_handled_by_extended_class;

/****************** Exercise 21 *****************
 * Demonstrate that a derived-class constructor
 * cannot catch exceptions thrown by its
 * base-class constructor.
 ***********************************************/

class Except1 extends Exception {
    public Except1(String s) {
        super(s);
    }
}

class BaseWithException {
    public BaseWithException() throws Except1 {
        throw new Except1("thrown by BaseWithException");
    }
}

class DerivedWE extends BaseWithException {
    // Produces compile-time error: unreported exception Except1
    /*
    public DerivedWE() { }
    */

    // Gives compile error: call to super must be first statement in constructor:
    /*
    public DerivedWE() {
        try {
            super();
        } catch (Except1 ex1) {
        }
    }
    */

    public DerivedWE() throws Except1 {
    }
}


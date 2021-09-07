package ru.brown.chapters.Exceptions_Chapter12.page401ex21_exc_not_handled_by_extended_class;

public class E21_ConstructorExceptions {
    public static void main(String args[]) {
        try {
            new DerivedWE();
        } catch (Except1 ex1) {
            System.out.println("Caught " + ex1);
        }
    }
}

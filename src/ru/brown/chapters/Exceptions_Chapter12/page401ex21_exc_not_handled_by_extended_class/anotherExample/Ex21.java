package ru.brown.chapters.Exceptions_Chapter12.page401ex21_exc_not_handled_by_extended_class.anotherExample;

public class Ex21 {
    public static void main(String[] args) {
        try {
            Derived d = new Derived();
        } catch (BaseException e) {
            System.out.println("BaseException caught in main()");
            System.out.println(e.getClass());
        }
    }
}
package ru.brown.chapters.Exceptions_Chapter12.page410ex27;

import static ru.brown.chapters.util.Print.print;

public class Ex27_Exceptions_TransformInto_RuntimeEx {
    static void demoRuntime() {
        char[] array = new char[10];
        try {
            array[10] = 'x';
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[]) {
        try {
            demoRuntime();
        } catch (RuntimeException ex) {
            try {
                throw ex.getCause();
            } catch (ArrayIndexOutOfBoundsException e) {
                print(ex.getMessage());
                print(ex.getCause());
            } catch (Throwable e) {
                System.out.println("Throwable" + e);
            }
        }
    }
}

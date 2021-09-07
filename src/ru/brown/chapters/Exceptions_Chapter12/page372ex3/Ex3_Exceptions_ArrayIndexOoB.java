package ru.brown.chapters.Exceptions_Chapter12.page372ex3;

public class Ex3_Exceptions_ArrayIndexOoB {
    public static void main(String args[]) {
        char[] array = new char[10];
        try {
            array[10] = 'x';
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("e = " + e);
        }
    }
}

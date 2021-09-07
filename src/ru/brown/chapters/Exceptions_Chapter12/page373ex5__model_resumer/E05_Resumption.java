package ru.brown.chapters.Exceptions_Chapter12.page373ex5__model_resumer;

public class E05_Resumption {
    public static void main(String args[]) {
        while (true) {
            try {
                Resumer.f();
            } catch (ResumerException e) {
                System.out.println("Caught " + e);
                continue;
            }
            System.out.println("Got through...");
            break;
        }
        System.out.println("Successful execution");
    }
}

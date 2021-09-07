package ru.brown.chapters.Exceptions_Chapter12.page393_lostExceptions.ex19;

import ru.brown.chapters.Exceptions_Chapter12.page393_lostExceptions.HoHoneyException;
import ru.brown.chapters.Exceptions_Chapter12.page393_lostExceptions.HoHumException;
import ru.brown.chapters.Exceptions_Chapter12.page393_lostExceptions.VeryImportantException;

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void lose() throws HoHoneyException {
        throw new HoHoneyException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch (HoHumException e){
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

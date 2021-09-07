package ru.brown.chapters.Exceptions_Chapter12.page393_lostExceptions;

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
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            }finally {
                lm.lose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package ru.brown.chapters.Exceptions_Chapter12.page409wrap_checked_ex;

import java.io.FileNotFoundException;
import java.io.IOException;

import static ru.brown.chapters.util.Print.print;

public class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException("Где я?");
                default:
                    return;
            }
        } catch (Exception e) {
            // Превращаем в неконтролируемое:
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {
}


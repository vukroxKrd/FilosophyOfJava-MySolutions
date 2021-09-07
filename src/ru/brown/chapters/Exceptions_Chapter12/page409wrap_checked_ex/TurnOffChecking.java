package ru.brown.chapters.Exceptions_Chapter12.page409wrap_checked_ex;

import java.io.FileNotFoundException;
import java.io.IOException;

import static ru.brown.chapters.util.Print.print;

public class TurnOffChecking {

    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        // Вы можете вызвать f() без блока try и позволить
        // исключению RuntimeException покинуть метод:
        wce.throwRuntimeException(1);
        // Или перехватить исключения:
        for (int i = 0; i < 4; i++)
            try {
                if (i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            } catch (SomeOtherException e) {
                print("SomeOtherException: " + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    print("FileNotFoundException: " + e);
                } catch (IOException e) {
                    print("IOException: " + e);
                } catch (Throwable e) {
                    print("Throwable: " + e);
                }
            }
    }
}

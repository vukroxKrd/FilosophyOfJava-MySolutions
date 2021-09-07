package ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits;

import ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits.exceptions.baseball.*;
import ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits.exceptions.storm.RainedOut;

public class StormyInning extends Inning implements Storm {
    // Можно добавлять новые исключения для конструкторов, но вы должны обработать
    // и исключения базового конструктора:
    public StormyInning()
            throws RainedOut, BaseballException {
    }

    public StormyInning(String s)
            throws Foul, BaseballException {
    }

    // Обычные методы должны соответствовать правилам базового класса:
    public void walk() {} //Ошибка компиляции

    @Override
    public void referee() throws UmpireException {
        System.out.println("Umpire makes sure rules are obeyed");
    }

    // Интерфейс НЕ МОЖЕТ добавлять исключения
    // к существующим методам базового класса:
    //! public void event() throws RainedOut {}
    // Если метод не был определен в базовом
    // классе, исключение допускается:
    public void rainHard() throws RainedOut {
        throw new RainedOut();
    }

    // Вы можете не возбуждать исключений вообще,
    // даже если базовая версия это делает:
    public void event() {
    }

    // Переопределенные методы могут возбуждать
    // унаследованные исключения:
    public void atBat() throws PopFoul {
        throw new PopFoul();
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
//            si.atBat();
            si.rainHard();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike не возбуждается в унаследованной версии,
        try {
            // Что произойдет при восходящем преобразовании?
            Inning i = new StormyInning();
            i.atBat();
            // Вы должны перехватывать исключения
            // из базовой версии метода:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("06mee исключение");
        }
    }
}

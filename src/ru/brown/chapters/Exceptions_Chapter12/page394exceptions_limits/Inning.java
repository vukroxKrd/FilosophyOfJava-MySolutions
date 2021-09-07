package ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits;

import ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits.exceptions.baseball.BaseballException;
import ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits.exceptions.baseball.Foul;
import ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits.exceptions.baseball.Strike;
import ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits.exceptions.baseball.UmpireException;

abstract class Inning {

    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // Фактически возбуждать исключение не нужно
    }
    public abstract void atBat() throws Strike, Foul;
    // Не возбуждает контролируемых исключений
    public void walk() {
    }
    public abstract void referee() throws UmpireException;
}

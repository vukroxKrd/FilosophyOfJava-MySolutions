package ru.brown.chapters.Exceptions_Chapter12.page410ex29;

import ru.brown.chapters.Exceptions_Chapter12.page410ex29.exceptions.baseball.BaseballException;
import ru.brown.chapters.Exceptions_Chapter12.page410ex29.exceptions.baseball.Foul;
import ru.brown.chapters.Exceptions_Chapter12.page410ex29.exceptions.baseball.Strike;
import ru.brown.chapters.Exceptions_Chapter12.page410ex29.exceptions.baseball.UmpireException;

abstract class Inning {

    public Inning(){}
    public void event(){
        // Фактически возбуждать исключение не нужно
    }
    public abstract void atBat();
    // Не возбуждает контролируемых исключений
    public void walk() {}
    public abstract void referee() ;
}

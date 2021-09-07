package ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits;

import ru.brown.chapters.Exceptions_Chapter12.page394exceptions_limits.exceptions.storm.RainedOut;

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

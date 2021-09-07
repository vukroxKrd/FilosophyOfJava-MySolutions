package ru.brown.chapters.Exceptions_Chapter12.page373_logger;

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("nepexвaчeно" + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("nepexвaчeно" + e);
        }
    }
}
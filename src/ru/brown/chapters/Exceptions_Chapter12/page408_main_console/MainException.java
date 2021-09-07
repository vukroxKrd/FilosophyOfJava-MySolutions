package ru.brown.chapters.Exceptions_Chapter12.page408_main_console;

import java.io.FileInputStream;

public class MainException {
    // Передаем все исключения на консоль:
    public static void main(String[] args) throws Exception {
        // Открываем файл:
        FileInputStream file = new FileInputStream("MainException.java");
        // Используем файл ...
        // Закрываем файл:
        file.close();
    }
}
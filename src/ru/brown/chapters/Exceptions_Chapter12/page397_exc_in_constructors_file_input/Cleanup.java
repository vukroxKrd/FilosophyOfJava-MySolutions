package ru.brown.chapters.Exceptions_Chapter12.page397_exc_in_constructors_file_input;

import ru.brown.chapters.util.Print;

public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("C:\\Users\\slava\\Downloads\\text.txt");
            try {
                String s;
                int i = 1;
                // Обработка данных по строкам...
                while ((s = in.getLine()) != null)
                Print.print(s);
            } catch (Exception e) {
                System.out.println("Caught исключение Exception в main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("Ошибка при конструировании InputFile");
        }
    }
}
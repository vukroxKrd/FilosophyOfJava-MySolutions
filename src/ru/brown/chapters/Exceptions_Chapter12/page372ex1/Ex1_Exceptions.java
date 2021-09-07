package ru.brown.chapters.Exceptions_Chapter12.page372ex1;

/*Создайте класс с методом main(), возбуждающим исключение типа Exception из блока try.
Задайте в конструкторе для Exception строковый аргумент.
Перехватите исключение в блоке catch и распечатайте текст аргумента.
Добавьте блок finally и выведите сообщение как доказательство его выполнения.
*/
public class Ex1_Exceptions {

    public static void main(String[] args) {
        try{
            throw new Exception("Ex1_Exception in main");
        } catch (Exception e){
            System.out.println("e.getMessage(): "+e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
    }
}

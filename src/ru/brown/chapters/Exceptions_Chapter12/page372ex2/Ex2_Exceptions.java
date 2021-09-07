package ru.brown.chapters.Exceptions_Chapter12.page372ex2;

/*2.Определите ссылку на объект и присвойте ей значение null.
Попробуйте вызвать метод объекта, пользуясь этой ссылкой.
Потом вставьте этот код в блок try-catch и перехватите исключение.*/
public class Ex2_Exceptions {

    public void hello(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Ex2_Exceptions demo;
        demo = null;
        try {
            demo.hello();
        } catch (NullPointerException e) {
            System.out.println("Handling NPE");
        }
    }
}

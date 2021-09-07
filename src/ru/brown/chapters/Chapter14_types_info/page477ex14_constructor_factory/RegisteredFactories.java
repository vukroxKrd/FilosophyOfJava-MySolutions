package ru.brown.chapters.Chapter14_types_info.page477ex14_constructor_factory;

/****************** Exercise 14 *****************
 * A constructor is a kind of factory method. Modify
 * RegisteredFactories.java so that instead of using
 * an explicit factory, the class object is stored
 * in the List, and newInstance() is used to create
 * each object.
 ***********************************************/

public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(Part.createRandom());
    }

}

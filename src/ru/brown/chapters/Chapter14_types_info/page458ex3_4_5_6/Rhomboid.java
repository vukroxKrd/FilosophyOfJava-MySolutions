package ru.brown.chapters.Chapter14_types_info.page458ex3_4_5_6;



/****************** Exercise 3 ******************
 * Add Rhomboid to Shapes.java. Create a
 * Rhomboid, upcast it to a Shape, then downcast
 * it back to a Rhomboid. Try downcasting to a
 * Circle and see what happens.
 ***********************************************/

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }

    @Override
    public void draw() {
        System.out.println("Rhomboid draw");
    }
}


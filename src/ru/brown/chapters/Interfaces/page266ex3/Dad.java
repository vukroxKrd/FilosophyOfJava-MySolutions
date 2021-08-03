package ru.brown.chapters.Interfaces.page266ex3;


// interfaces/Ex3.java
// TIJ4 Chapter Interfaces, Exercise 3, page 315
/* Create a base class with an abstract print() method that is overridden in a
 * derived class. The overridden version of the method prints the value of an int
 * variable defined in the derived class. At the point of definition of this
 * variable, give it a nonzero value. In the base-class constructor, call this
 * method. In main(), create an object of the drived type, and then call its
 * print() method. Explain the results.
 */

abstract class Dad {

    protected abstract void print();

    Dad() {
        print();
    }
}




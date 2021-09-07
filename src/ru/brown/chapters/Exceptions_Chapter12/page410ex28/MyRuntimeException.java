package ru.brown.chapters.Exceptions_Chapter12.page410ex28;

/****************** Exercise 28 ******************
 * Modify Exercise 4 so that the custom exception
 * class inherits from RuntimeException, and show
 *  * that the compiler allows you to leave out the
 *  * try block.
 *  ***********************************************/
class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String s) { super(s); }
}


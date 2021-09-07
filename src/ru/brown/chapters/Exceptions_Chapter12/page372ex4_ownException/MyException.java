package ru.brown.chapters.Exceptions_Chapter12.page372ex4_ownException;

class MyException extends Exception {
    String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    public void printMsg() {
        System.out.println("msg = " + msg);
    }
}

// Or take a more clever approach,
// noting that string storage and printing are built into Exception:
class MyException2 extends Exception {
    public MyException2(String s) {
        super(s);
    }
}
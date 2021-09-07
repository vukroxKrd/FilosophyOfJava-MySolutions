package ru.brown.chapters.Exceptions_Chapter12.page401ex21_exc_not_handled_by_extended_class.anotherExample;

class BaseException extends Exception {
}

class Base {
    Base() throws BaseException {
        throw new BaseException();
    }
}

class Derived extends Base {
    // BaseException must be caught (no way) or declared to be thrown:
    Derived() throws BaseException {
        super();
        // not this way, 'catch' without 'try' not allowed:
        // catch(BaseException e) {}
        // not this way either, because call to super
        // must be first statement in constructor:
        // try {
        //	super();
        // } catch(BaseException e) {}
    }
}


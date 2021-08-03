package ru.brown.chapters.Polymorphism.page248;

public class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}


/*Output:
sup.field=0,sup.getField()=1
sub.field=1,sub.getField()=1,sub.getSuperField()=0
*/


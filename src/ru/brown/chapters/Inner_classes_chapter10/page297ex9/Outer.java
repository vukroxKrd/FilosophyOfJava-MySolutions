package ru.brown.chapters.inner_classes.page297ex9;

class Outer {
    private class Inner implements Exercise9{

        Exercise9 createInner() {
            return new Inner();
        }

        @Override
        public void say(String s) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.createInner().say("Hello");
        // Error: cannot find symbol: class Inner:
         //((Inner)outer.createInner()).say("hello");
    }
}

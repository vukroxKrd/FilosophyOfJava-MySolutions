package ru.brown.chapters.inner_classes.page301_ex11;


public class OuterEx11 {
    Exercise11 inner() {
        return new Exercise11() {
            private String x = "hi";
            @Override
            public void sayHi() {
                System.out.println(x);
            }
        };
    }

    public static void main(String[] args) {
        OuterEx11 o = new OuterEx11();
//        System.out.println(o.inner().sayHi());
        o.inner().sayHi();
    }
}


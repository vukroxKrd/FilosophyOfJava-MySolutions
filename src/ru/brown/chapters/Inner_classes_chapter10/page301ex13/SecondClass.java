package ru.brown.chapters.inner_classes.page301ex13;

import ru.brown.chapters.util.Print;

public class SecondClass {
    public ClassNoConstr noArgsConstClass(int a, int b){
        return new ClassNoConstr(a, b){

        };
    }

    public static void main(String[] args) {
        SecondClass x = new SecondClass();
        x.noArgsConstClass(4,5).show();
    }
}

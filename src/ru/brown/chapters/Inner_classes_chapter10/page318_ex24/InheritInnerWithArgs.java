package ru.brown.chapters.Inner_classes_chapter10.page318_ex24;

public class InheritInnerWithArgs extends WithInnerAndArgs.Inner{

    public InheritInnerWithArgs(WithInnerAndArgs wia, String field1, String field2) {
        wia.super(field1, field2);
    }
}

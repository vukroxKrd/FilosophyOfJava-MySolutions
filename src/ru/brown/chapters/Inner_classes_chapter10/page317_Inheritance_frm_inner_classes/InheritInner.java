package ru.brown.chapters.Inner_classes_chapter10.page317_Inheritance_frm_inner_classes;

public class InheritInner extends WithInner.Inner {
    // Не компилируется
    //    InheritInner() {}
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
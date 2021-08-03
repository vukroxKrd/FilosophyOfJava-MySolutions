package ru.brown.chapters.Interfaces.page282;

public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {
        }
    }

    class CImp implements A.C {
        public void f() {
        }
    }

// Нельзя реализовать private-интерфейс, кроме как
// внутри класса, где он был определен:
//! class DImp implements A.D {
//    public void f() {}
//! }
    class Elmp implements E {
        public void g() {
        }
    }

    class EGImp implements E.G {
        public void f() {
        }
    }

    class EImp2 implements E {
        public void g() {
        }

        class EG implements E.G {
            public void f() {
            }
        }

    }

    public static void main(String[] args) {
        A a = new A();
// Нет доступа к A.D:
// A.D ad = a.getD();
// Не возвращает ничего, кроме A.D:
// A.DImp2 di2 = (A.DImp2) a.getD();
// di2.f();
// Нельзя получить доступ к члену интерфейса:
// ((A.DImp2) a.getD()).f();
// Только другой класс А может использовать getD():
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
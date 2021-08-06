package ru.brown.chapters.Inner_classes_chapter10.page320_local_inner_classes;

import ru.brown.chapters.util.Print;

public class LocalInnerClass {
    // переменная count - private, но внутренний локальный и анонимный классы имеют к ней доступ
    private int count = 0;

    Counter getCounter(final String name) {

        // Локальный внутренний класс:
        /*Единственная причина использования локального внутреннего класса вместо анонимного
        внутреннего класса —возможность создания более чем одного объекта такого класса.*/
        class LocalCounter implements Counter {
            public LocalCounter() {
                // У локального внутреннего класса может быть собственный конструктор:
                Print.printnb("LocalCounter()");
            }

            public int next() {
                // Неизменный аргумент
                Print.printf(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    // То же с анонимным внутренним классом:
    Counter getCounter2(final String name) {
        return new Counter() {
            // Анонимный внутренний класс не может содержать именованного конструктора, только инициализатор экземпляра
            {
                Print.print("Counter()");
            }

            public int next() {
                Print.printnb(name); // Неизменный аргумент
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local "),
                c2 = lic.getCounter2("Anonymous ");
        for (int i = 0; i < 5; i++)
            Print.print(c1.next());
        for (int i = 0; i < 5; i++)
            Print.print(c2.next());
    }
}
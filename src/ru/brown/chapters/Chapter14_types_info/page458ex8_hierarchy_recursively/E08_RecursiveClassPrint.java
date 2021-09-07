package ru.brown.chapters.Chapter14_types_info.page458ex8_hierarchy_recursively;

import static ru.brown.chapters.util.Print.print;

public class E08_RecursiveClassPrint {
    static void printClasses(Class<?> c) {

        // getSuperclass() returns null on Object:
        if (c == null) return;
        print(c.getName());
        // Produces the interfaces that this class
        // implements:
        for (Class<?> k : c.getInterfaces()) {
            print("Interface: " + k.getName());
            printClasses(k.getSuperclass());
        }
        printClasses(c.getSuperclass());
        print(c.getDeclaredFields());
    }

    public static void main(String args[]) throws Exception {
        for (int i = 0; i < args.length; i++) {
            print("Displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1)
                System.out.println("==================");
        }
    }
}

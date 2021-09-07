package ru.brown.chapters.Chapter14_types_info.page488_null;

class Person {
    public final String first;
    public final String last;
    public final String address;
    // И т.д.

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    public String toString() {
        return "Person: FirstName: " + first + "; Last Name: " + last + "; Address: " + address+" ; ";
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() {
            super("None", "None", "None");
        }

        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}

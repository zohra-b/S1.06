package org;

public class Main {
    public static void main(String[] args) {
        Person obj1 = new Person("Virginie", "Despentes", 57);
        String obj2 = "author";
        int obj3 = 12;



        GenericMethod.print(obj1, obj2, obj3);
        GenericMethod.print(obj3, obj1, obj2);
        GenericMethod.print(obj2, obj3, obj1);

    }
}
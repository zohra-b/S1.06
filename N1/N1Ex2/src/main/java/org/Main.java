package org;

public class Main {
    public static void main(String[] args) {
        Person obj1 = new Person("Virginie", "Despentes", 57);
        String obj2 = "author";
        int obj3 = 12;


//        GenericMethod<Person, String, Integer> gm1 = new GenericMethod(new Person("Annie", "Ernaux", 82), "obj2", 18 );
//        GenericMethod gm2 = new GenericMethod(obj1, obj2, obj3);
//        System.out.println(gm1);
//        System.out.println(gm2);

        GenericMethod.print(obj1, obj2, obj3);
        GenericMethod.print(obj3, obj1, obj2);

    }
}
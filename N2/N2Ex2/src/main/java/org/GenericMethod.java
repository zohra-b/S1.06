package org;

public class GenericMethod<T> {

    public static<T> void print(T... args) {
        for (T arg : args) {
            System.out.println(
                    arg.toString() + "\n");                           ;
        }
    }
}

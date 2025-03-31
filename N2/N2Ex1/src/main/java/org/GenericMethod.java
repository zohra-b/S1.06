package org;

public class GenericMethod<T, U, V> {

    public static<T,V> void print(T arg1, String arg2, V arg3){
        System.out.println(
                "Arg1 : " + arg1.toString() +"\n" +
                "Arg2 : " + arg2 + "\n" +
                "Arg3 : " + arg3.toString());
    }

}

package org;

public class GenericMethod<T, U, V> {

    public static<T,U,V> void print(T arg1, U arg2, V arg3){
        System.out.println("Arg1 : " + arg1.toString() +"\n" +
                "Arg2 : " + arg2.toString() + "\n" +
                "Arg3 : " + arg3.toString());
    }


}

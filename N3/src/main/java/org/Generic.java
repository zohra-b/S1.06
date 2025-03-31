package org;

public class Generic {

    public static <T extends Phone> void firstGenericMethod(T arg){

        System.out.println("Running my first generic method");
                T.call();

    }

    public static <T extends Smartphone> void secondGenericMethod(T arg){
        System.out.println("Running my second generic method");
        T.call() ;
        T.takePhotos();
    }
}

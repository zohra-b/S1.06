package org;

public class Generic {

    public static <T extends Phone> void firstGenericMethod(T arg){

        System.out.println("Running my first generic method");
                arg.call();
                //arg.takePhotos();

    }

    public static <T extends Smartphone> void secondGenericMethod(T arg){
        System.out.println("Running my second generic method");
        arg.call() ;
        arg.takePhotos();
    }
}

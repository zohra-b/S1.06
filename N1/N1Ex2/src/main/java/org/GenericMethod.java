package org;

public class GenericMethod<T, U, V> {
//    private T arg1;
//    private U arg2;
//    private V arg3;
//
//    public GenericMethod(T arg1, U arg2, V arg3) {
//        this.arg1 = arg1;
//        this.arg2 = arg2;
//        this.arg3 = arg3;
//    }

    public static<T,U,V> void print(T arg1, U arg2, V arg3){
        System.out.println("Arg1 : " + arg1.toString() +"\n" +
                "Arg2 : " + arg2.toString() + "\n" +
                "Arg3 : " + arg3.toString());
    }

//    @Override
//    public String toString() {
//        return "GenericMethod{" +
//                "arg1=" + arg1 +
//                ", arg2=" + arg2 +
//                ", arg3=" + arg3 +
//                '}';
//    }
}

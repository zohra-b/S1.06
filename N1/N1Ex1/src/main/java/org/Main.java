package org;

public class Main {
    public static void main(String[] args) {
        String s1 = "primer argument";
        String s2 = "segon argument";
        String s3 = "tercer argument";

        NoGenericMethods ngm1 = new NoGenericMethods(s1, s2, s3);
        NoGenericMethods ngm2 = new NoGenericMethods(s2, s3, s1);
        NoGenericMethods ngm3 = new NoGenericMethods(s3, s1, s2);

        System.out.println("ngm1 : " + ngm1);
        System.out.println("ngm2 : " +ngm2);
        System.out.println("ngm3 : " +ngm3);

    }
}
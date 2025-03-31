package org;

public class Principal {
    public static void main(String[] args) {
        Smartphone mySmartphone = new Smartphone();

        Generic.firstGenericMethod(mySmartphone);
        Generic.secondGenericMethod(mySmartphone);
    }
}

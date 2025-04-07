package org;

public class Smartphone implements Phone {

    @Override
    public void call(){
        System.out.println("Your smartphone is calling ...");
    }

    public void takePhotos(){
        System.out.println("Your smartphone is taking photos ...");
    }
}

package org;

public class Person {
    String name;
    String surname;
    int age;

        public Person(String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }


        public String toString(){
            return "Person : " + this.name + " " + this.surname + ", " + this.age + " years";
        }

}

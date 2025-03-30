package org;

public class NoGenericMethods {
    String arg1;
    String arg2;
    String arg3;

    public NoGenericMethods(String arg1, String arg2, String arg3){
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public String getArg3() {
        return arg3;
    }

    public void setArg3(String arg3) {
        this.arg3 = arg3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods : \n"
                + "arg1 = " + arg1 + "\n" +
                        "arg2 = " + arg2 + "\n" +
                        "arg3 = " + arg3 + "\n" ;
    }
}

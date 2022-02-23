package com.sapient.day4;

import org.w3c.dom.ls.LSOutput;

public class First_C {
public void myMethod(){
    System.out.println("my Method");

}
    public  First_C(){
        System.out.println("constructor");

    }

    {
        System.out.println("instance Block");

    }

    static {
        System.out.println("static body");
    }

    public static void main(String[] args) {
        First_C c=new First_C();
//        c.First_C();
        c.myMethod();
    }
}


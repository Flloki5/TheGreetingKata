package com.flloki;

public class Introduce {

    public static String greet(String name){
        if(name == null){
            return "Hello, my friend.";
        }else {
            return "Hello, " + name + ".";
        }
    }
}

package com.flloki;

public class Introduce {

    public static String greet(String name){

        if(name == null) {
            return "Hello, my friend.";
        }else if(stringIsUpperCase(name)){
            return "HELLO, " + name + "!";
        }else {
            return "Hello, " + name + ".";
        }
    }

    public static String greet(String... names){

        return "Hello, " + String.join(" and ", names) + ".";
    }

    public static boolean stringIsUpperCase(String name){

        long count = name.chars()
                .filter(Character::isUpperCase)
                .count();

        return count == name.length();
    }
}

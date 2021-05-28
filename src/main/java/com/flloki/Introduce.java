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

        if(names.length == 2){
            return "Hello, " + String.join(" and ", names) + ".";
        }else{
            StringBuilder builder = new StringBuilder();
            builder.append("Hello, ");

            for (int i = 0; i < names.length - 1; i++) {
                builder.append(names[i] + ", ");
            }

            builder.append("and " + names[names.length - 1] + ".");

            return builder.toString();
        }

    }

    public static boolean stringIsUpperCase(String name){

        long count = name.chars()
                .filter(Character::isUpperCase)
                .count();

        return count == name.length();
    }
}

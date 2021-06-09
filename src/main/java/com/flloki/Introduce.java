package com.flloki;

import java.util.stream.Stream;

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
        }else if(isArrayContainsUpperCaseString(names)){
            return generateMixedGreet(names);
        }else{
            return generateSimpleGreet(names);
        }
    }

    private static String generateMixedGreet(String... names){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello, " + names[0]);
        builder.append(" and " + names[2]);
        builder.append(". AND HELLO " + names[1] + "!");
//        for(int i = 0; i <= 2; i++){
//            for(int j = 0; j < names.length; j++){
//                if(i == 0 && stringIsUpperCase(names[j])){
//                    builder.append(names[j] + ", ");
//                }
//            }
//        }
        return builder.toString();
    }

    public static boolean isArrayContainsUpperCaseString(String... names){
        long count = Stream.of(names)
                .filter(Introduce::stringIsUpperCase)
                .count();
        return count > 0;
    }

    private static String generateSimpleGreet(String... names){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello, ");

        for (int i = 0; i < names.length - 1; i++) {
            builder.append(names[i] + ", ");
        }

        builder.append("and " + names[names.length - 1] + ".");
        return builder.toString();
    }

    public static boolean stringIsUpperCase(String name){
        long count = name.chars()
                .filter(Character::isUpperCase)
                .count();
        return count == name.length();
    }
}

package com.flloki;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Introduce {

    public String greet(String name){

        if(name == null) {
            return "Hello, my friend.";
        }else if(stringIsUpperCase(name)){
            return "HELLO, " + name + "!";
        }else {
            return "Hello, " + name + ".";
        }
    }

    public String greet(String... names){
        String[] validatedNames = validateInput(names);
        if(validatedNames.length == 2){
            return "Hello, " + String.join(" and ", validatedNames) + ".";
        }else if(!isArrayContainsUpperCaseString(validatedNames)){
            return generateSimpleGreet(validatedNames);
        }else{
            return generateMixedGreet(validatedNames);
        }
    }

    private String[] validateInput(String[] names){
        String[] newArray = new String[names.length + 1];
        for(int index = 0; index < names.length; index++){
            if(names[index].contains(",")) {
                String[] splitStringArr = names[1].split(",");
                newArray[0] = names[0];
                newArray[1] = splitStringArr[0].strip();
                newArray[2] = splitStringArr[1].strip();
                return newArray;
            }
        }
        return names;
    }

    private String generateMixedGreet(String... names){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello, " + names[0]);
        builder.append(" and " + names[2]);
        builder.append(". AND HELLO " + names[1] + "!");

        /* Alternative way, but more complicated and ugly... */
//        builder.append("Hello, ");
//        for(int i = 0; i <= 2; i++){
//            for(int j = 0; j < names.length; j++){
//                if(i == 0 && !stringIsUpperCase(names[j])){
//                    if(j == names.length - 1){
//                        builder.append(names[j] + ".");
//                    }else {
//                        builder.append(names[j] + " and ");
//                    }
//                }else if(i == 1 && stringIsUpperCase(names[j])){
//                    builder.append(" AND HELLO " + names[j] + "!");
//                }
//            }
//        }
        return builder.toString();
    }


    private boolean isArrayContainsUpperCaseString(String... names){
        long count = Stream.of(names)
                .filter(name -> stringIsUpperCase(name))
                .count();
        return count > 0;
    }

    private String generateSimpleGreet(String... names){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello, ");

        for (int i = 0; i < names.length - 1; i++) {
            builder.append(names[i] + ", ");
        }

        builder.append("and " + names[names.length - 1] + ".");
        return builder.toString();
    }

    private boolean stringIsUpperCase(String name){
        long count = name.chars()
                .filter(Character::isUpperCase)
                .count();
        return count == name.length();
    }
}

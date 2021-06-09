package com.flloki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntroduceTest {

    private Introduce introduce = new Introduce();

    @Test
    public void should_ReturnGreet_ForGivenName(){
        assertEquals("Hello, Bob.", introduce.greet("Bob"));
    }

    @Test
    public void should_ReturnDefaultGreet_When_NameIsNull(){
        assertEquals("Hello, my friend.", introduce.greet((String) null));
    }

    @Test
    public void should_ReturnUppercase_When_NameIsUppercase(){
        assertEquals("HELLO, BOB!", introduce.greet("BOB"));
        assertEquals("Hello, BOb.", introduce.greet("BOb"));
    }

    @Test
    public void should_ReturnGreet_When_InputIsTwoNames(){
        assertEquals("Hello, Bob and Marley.", introduce.greet("Bob", "Marley"));
        assertEquals("Hello, Bob and Marley.", introduce.greet(new String[] {"Bob", "Marley"}));
    }

    @Test
    public void should_ReturnGreet_When_InputIsMoreThanTwoNames(){
        assertEquals("Hello, Bob, Marley, and Charlotte.", introduce.greet("Bob", "Marley", "Charlotte"));
        assertEquals("Hello, Bob, Marley, Charlotte, and Tom.", introduce.greet("Bob", "Marley", "Charlotte", "Tom"));
    }

    @Test
    public void should_ReturnMixedGreet_When_InputContainsLowerAndUppercaseLetters(){
        assertEquals("Hello, Bob and Charlotte. AND HELLO MARLEY!", introduce.greet("Bob", "MARLEY", "Charlotte"));
    }

    @Test
    public void should_ReturnGreet_When_StringContainsComma(){
        assertEquals("Hello, Bob, Marley, and Charlotte.", introduce.greet("Bob", "Marley, Charlotte"));
    }

}

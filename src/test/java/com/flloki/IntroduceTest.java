package com.flloki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntroduceTest {

    @Test
    public void should_ReturnGreet_ForGivenName(){
        assertEquals("Hello, Bob.", Introduce.greet("Bob"));
    }

    @Test
    public void should_ReturnDefaultGreet_When_NameIsNull(){
        assertEquals("Hello, my friend.", Introduce.greet(null));
    }

    @Test
    public void should_ReturnUppercase_When_NameIsUppercase(){
        assertEquals("HELLO, BOB.", Introduce.greet("BOB"));
        assertEquals("Hello, BOb.", Introduce.greet("BOb"));
    }

}

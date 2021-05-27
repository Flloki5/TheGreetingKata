package com.flloki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntroduceTest {

    @Test
    public void should_ReturnGreet_ForGivenName(){
        assertEquals("Hello, Bob", Introduce.greet("Bob"));
    }

    @Test
    public void should_ReturnGreet_When_NameIsNull(){
        assertEquals("Hello, friend.", Introduce.greet(null));
    }

}

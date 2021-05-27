package com.flloki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntroduceTest {

    @Test
    public void should_ReturnGreet_ForGivenName(){
        Introduce introduce = new Introduce();
        assertEquals("Hello, Bob.", introduce.greet("Bob"));
    }

}

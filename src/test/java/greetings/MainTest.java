package greetings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    Main greetings = new Main();

    @Test
    public void testGreetNormalName(){
        assertEquals("Hello, Bob.", greetings.greet("Bob"));
    }
}
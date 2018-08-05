package greetings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    Main greetings = new Main();

    @Test
    public void testGreetNormalName(){
        assertEquals("Hello, Bob.", greetings.greet("Bob"));
    }


    @Test
    public void testGreetNullName(){ assertEquals("Hello, my friend.", greetings.greet(null)); }


    @Test
    public void testGreetShout(){ assertEquals("HELLO, JERRY!", greetings.greet("JERRY")); }

}
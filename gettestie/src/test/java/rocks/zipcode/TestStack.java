package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void testPop() {
        Stack<String> stack = new Stack<>();
        String expected = "Hello Squirrel";
        String expected2 = "Hello World";
        stack.push(expected);
        stack.push(expected2);
        String actual = stack.pop();
        Assert.assertEquals(expected, actual);
    }

    // Make a bigger test exercising more Stack methods.....
}

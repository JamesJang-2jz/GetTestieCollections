package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

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

    @Test
    public void testSearch() {
        String input = "toyota";
        String input2 = "nissan";
        String input3 = "mazda";
        Integer expected = 3;
        Stack<String> tm = new Stack<>();
        // When
        tm.push(input);
        tm.push(input2);
        tm.push(input3);
        Integer actual = tm.search(input);
        // Then
        Assert.assertEquals(expected, actual);
        // Make a bigger test exercising more Stack methods.....
    }
}

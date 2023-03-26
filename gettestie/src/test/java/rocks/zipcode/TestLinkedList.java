package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TestLinkedList {
    @Test
    public void testFirstElement(){
        // Given
        String first = "first";
        String second = "second";
        LinkedList <String> list = new LinkedList<>();
        list.add(first);
        list.add(second);
        // When
        String actual = list.peek();
        // Then
        Assert.assertEquals(first, actual);
    }

    @Test
    public void testLastElement(){
        // Given
        String[] arr = {"lol", "haha","meow","woof","pika"};
        LinkedList <String> list = new LinkedList<>();
        Collections.addAll(list, arr);
        // When
        String expected = "pika";
        String actual = list.getLast();
        // Then
        Assert.assertEquals(expected, actual);
    }
}

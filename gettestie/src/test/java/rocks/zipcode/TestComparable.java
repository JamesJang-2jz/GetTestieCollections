package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.PriorityQueue;

public class TestComparable {
    @Test
    public void testRemov(){
        //Given
        String[] arr = {"lol", "haha", "rofl"};
        PriorityQueue<String> pq = new PriorityQueue<>();
        Collections.addAll(pq, arr);
        String expected = "lol";
        // When
        pq.poll();
        String actual = pq.peek();

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        //Given
        String[] arr = {"lol", "haha", "rofl"};
        PriorityQueue<String> pq = new PriorityQueue<>();
        Collections.addAll(pq, arr);
        String expected = "lol";
        // When
        pq.poll();
        String actual = pq.peek();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

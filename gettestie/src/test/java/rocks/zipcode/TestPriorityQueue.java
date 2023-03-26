package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    @Test
    public void testPoll(){
        //Given
        String[] arr = {"lol", "haha","lmao"};
        PriorityQueue<String> pq = new PriorityQueue<>();
        Collections.addAll(pq, arr);
        // When
        String expected = "haha";
        String actual = pq.poll(); // elements are only ordered when using dequed or using poll()
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

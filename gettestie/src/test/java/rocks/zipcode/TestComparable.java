package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class TestComparable {
    @Test
    public void testCompare(){
        //Given
        String[] arr = {"lol", "haha", "rofl"};
        String expected = "haha";
        // When
        String comp = arr[2];

        // Then
        Assert.assertTrue(expected.compareTo(comp) <= -1);
    }
    @Test
    public void testCompare1(){
        //Given
        Integer x = 24;
        Integer y = 24;
        // When

        // Then
        Assert.assertEquals( x.compareTo(y), 0);
    }
}

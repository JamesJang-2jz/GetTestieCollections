package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayDeque {
    @Test
    public void testNull(){
        // Given
        String[] input = {"toyota","nissan","mazda"};
        ArrayDeque<String> arrDq = new ArrayDeque<>();
        Collections.addAll(arrDq, input);
        // When
        arrDq.clear();
        String expected = null;
        String actual = arrDq.peek();
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testLast(){
        // Given
        String[] input = {"toyota","nissan","mazda"};
        ArrayDeque<String> ad = new ArrayDeque<>();
        Collections.addAll(ad, input);
        // When
        String expected = "mazda";
        String actual = ad.getLast();
        // Then
        Assert.assertEquals(expected,actual);

    }

}

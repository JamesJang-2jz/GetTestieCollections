package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class TestTreeMap {
    @Test
    public void testAddKV(){
        // Given
        String input = "toyota";
        String input2 = "nissan";
        String input3 = "mazda";
        Map<Integer, String> tm = new TreeMap<>();
        tm.put(1, input);
        tm.put(2,input2);
        tm.put(3,input3);
        // When
        String expected = "mazda";
        String actual = tm.get(3);

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testReplace(){
        // Given
        String input = "toyota";
        String input2 = "nissan";
        String expected = "mazda";
        Map<Integer, String> tm = new TreeMap<>();
        tm.put(1, input);
        tm.put(2,input2);
        tm.replace(2,expected);
        // When
        String actual = tm.get(2);
        // Then
        Assert.assertEquals(expected, actual);
    }
}

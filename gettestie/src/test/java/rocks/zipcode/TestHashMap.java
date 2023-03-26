package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    @Test
    public void testAdd(){
        // Given
        String expected = "lol I'm in a map";
        int expectedNum = 2;
        Map<Integer, String> map = new HashMap<>();

        // When
        map.put(expectedNum, expected);
        String actual = map.get(expectedNum);
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testNull(){
        // Given
        String expected = "I'm a value";
        String nully = null;
        Map<String, String> map = new HashMap<>();
        // When
        map.put(nully,expected);
        String actual = map.get(null);
        // Then
        Assert.assertEquals(expected,actual );
        // Hashmap can have one null key and multiple null values
    }

}

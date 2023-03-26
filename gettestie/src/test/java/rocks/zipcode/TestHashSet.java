package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {
    @Test
    public void testUnique(){
        //Given
        String haha = "haha";
        String haha1 = "haha";
        int expectedSize = 1;
        HashSet<String> set = new HashSet<>();
        // When
        set.add(haha);
        set.add(haha1);
        // Then
        Assert.assertEquals(expectedSize, set.size());
    }
    @Test
    public void testNull(){
        // Given
        String lol = "lol";
        HashSet<String> set = new HashSet<>(2);
        // When
        set.add(lol);
        set.add(null);
        //Then
        Assert.assertTrue(set.contains(null));
    }

}

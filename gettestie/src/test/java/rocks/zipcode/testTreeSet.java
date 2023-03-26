package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class testTreeSet {
    @Test
    public void testUnique(){
        //Given
        String haha = "haha";
        String haha1 = "haha";
        int expectedSize = 1;
        TreeSet<String> set = new TreeSet<>();
        // When
        set.add(haha);
        set.add(haha1);
        // Then
        Assert.assertEquals(expectedSize, set.size());
    }
    @Test
    public void testFirst(){
        //Given
        String[] arr = {"lol", "haha","meow","woof","pika"};
        TreeSet<String> set = new TreeSet<>();
        Collections.addAll(set,arr);
        // When
        String expected = "haha";
        String actual = set.pollFirst();
        // Then
        Assert.assertEquals(expected, actual);
    }
}

package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestIterator {
    @Test
    public void testAddElements(){
        //Given
        String[] arr = {"lol", "haha","meow","woof","pika"};
        ArrayList<String> arrList = new ArrayList<>();
        Collections.addAll(arrList, arr);
        // When
        Iterator<String> it = arrList.iterator();
        String expected = "lol";
        String actual = it.next();
        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRemove(){
        //Given
        String[] arr = {"lol", "haha"};
        ArrayList<String> arrList = new ArrayList<>();
        Collections.addAll(arrList, arr);
        // When
        Iterator<String> it = arrList.iterator();
        it.next();
        it.remove();
        it.next();
        it.remove();
        // Then
        Assert.assertFalse(it.hasNext());
    }
}

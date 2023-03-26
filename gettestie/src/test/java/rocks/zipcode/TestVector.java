package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Vector;

public class TestVector {
    @Test
    public void testRemoveAll(){
        // Given
        String[] input = {"toyota","nissan","mazda"};
        Vector<String> vect = new Vector<>();
        Collections.addAll(vect, input);
        // When
        vect.removeAllElements();
        // Then
        Assert.assertTrue(vect.isEmpty());
    }
    @Test
    public void testIndexOf(){
        // Given
        String[] input = {"toyota","nissan","mazda"};
        Vector<String> vect = new Vector<>();
        Collections.addAll(vect, input);
        // When
        String expected = "nissan";
        String actual = vect.elementAt(1);
        // Then
        Assert.assertEquals(expected, actual);
    }

}

package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    @Test
    public void testDuplicate(){
        //Given
        String hello = "hello";
        String hello1 = "hello";
        int expectedSize = 2;
        ArrayList<String> arrList = new ArrayList<>();
        // When
        arrList.add(hello);
        arrList.add(hello1);
        // Then
        Assert.assertEquals(expectedSize, arrList.size());
    }
    @Test
    public void testAddItem(){
        //Given
        int expected = 33;
        List<Integer> list = new ArrayList<>();
        //When
        list.add(expected);
        int actual = list.get(0);
        //Then
        Assert.assertEquals(expected, actual);
    }

}

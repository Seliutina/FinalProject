package test.goit.lessons.homeWork.module05;

import com.goit.lessons.homeWork.module05.ActionWithArray;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class ActionWithArrayTest {

    private ActionWithArray actionWithArray;
    private int[] array;
    private ByteArrayOutputStream stream;

    @Before
    public void actionWithArrays (){
        actionWithArray = new ActionWithArray();
        array = new int[] {3,4,5,12,-4};
        stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));

    }

    @Test
    public void minElement() throws Exception {
        actionWithArray.minElement(array);

        assertEquals("Min value in the array is -4\r\n", stream.toString());
    }

    @Test
    public void maxElement() throws Exception {
        actionWithArray.maxElement(array);

        assertEquals("Max value in the array is 12\r\n", stream.toString());
    }

    @Test
    public void shakerSort() throws Exception {
        actionWithArray.shakerSort(array);

        assertEquals("Sorted array is: \r\n-4 3 4 5 12 ", stream.toString());
    }

}
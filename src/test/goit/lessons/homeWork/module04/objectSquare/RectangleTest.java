package test.goit.lessons.homeWork.module04.objectSquare;

import com.goit.lessons.homeWork.module04.objectSquare.Rectangle;
import com.goit.lessons.homeWork.module04.objectSquare.Shape;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void square() throws Exception {
        Shape rectangle = new Rectangle();
        assertEquals(0, rectangle.square(0,34), 0);
        assertEquals(4, rectangle.square(2,2), 0);
    }

}
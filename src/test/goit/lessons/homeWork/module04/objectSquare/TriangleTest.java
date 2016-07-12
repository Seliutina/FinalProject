package test.goit.lessons.homeWork.module04.objectSquare;

import com.goit.lessons.homeWork.module04.objectSquare.Shape;
import com.goit.lessons.homeWork.module04.objectSquare.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleTest {
    @Test
    public void square() throws Exception {
        Shape triangle = new Triangle();
        assertEquals(3, triangle.square(3,2), 0);
        assertEquals(3, triangle.square(3,2), 0);
    }

}
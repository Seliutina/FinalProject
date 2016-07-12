package test.goit.lessons.homeWork.module04.objectSquare;

import com.goit.lessons.homeWork.module04.objectSquare.Circle;
import com.goit.lessons.homeWork.module04.objectSquare.Shape;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void square() throws Exception {
        Shape circle = new Circle();
         assertEquals(Math.PI*4, circle.square(2), 0);
    }

}
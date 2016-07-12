package test.goit.lessons.homeWork.module01;

import com.goit.lessons.homeWork.module01.FirstProgram;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FirstProgramTest {
    @Test
    public void main() throws Exception {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
        FirstProgram firstProgram = new FirstProgram();
        firstProgram.main(null);
        assertEquals("Hi", stream.toString());
    }

}
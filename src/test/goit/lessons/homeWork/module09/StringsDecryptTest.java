package test.goit.lessons.homeWork.module09;

import com.goit.lessons.homeWork.modules09.StringsDecrypt;
import org.junit.Test;

import static org.junit.Assert.*;


public class StringsDecryptTest {
    @Test
    public void decrypt() throws Exception {
        StringsDecrypt stringsDecrypt = new StringsDecrypt(2,3);
        StringBuilder stringBuilder = new StringBuilder("vguУКv, .67");

        assertEquals("tesУКt, .34", stringsDecrypt.decrypt(stringBuilder).toString());
    }
}
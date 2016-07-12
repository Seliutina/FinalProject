package test.goit.lessons.homeWork.module09;

import com.goit.lessons.homeWork.modules09.StringsEncrypt;
import org.junit.Test;


import static org.junit.Assert.*;


public class StringsEncryptTest {
    @Test // following warning message is expected: [WARNING]: some letters not from English alphabet,weren't encrypted
    public void encrypt() throws Exception {
        StringsEncrypt stringsEncrypt = new StringsEncrypt(2,3);

        assertEquals("vguЩv, .67", stringsEncrypt.encrypt("tesЩt, .34").toString());
    }

}
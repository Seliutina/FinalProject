package com.goit.lessons.homeWork.module10;

import com.goit.lessons.homeWork.modules09.CaesarMain;
import com.goit.lessons.homeWork.modules09.StringsDecrypt;
import com.goit.lessons.homeWork.modules09.StringsEncrypt;
import java.io.*;

public class FileCreation {
        public static void main(String[] args) throws Exception{
            CaesarMain caesarMain = new CaesarMain();
            StringsEncrypt stringsEncrypt = new StringsEncrypt(2, 7);
            StringsDecrypt stringsDecrypt = new StringsDecrypt(2, 7);

            String[] array = caesarMain.FillList();

            try{
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("tmp.txt")));
                for (int i = 0; i < array.length; i++) {
                    String toWrite = array[i];
                    out.println(toWrite);
                }
                out.println("\r\n");
                for (int i = 0; i < array.length; i++) {
                    String toWrite = stringsEncrypt.encrypt(array[i]).toString();
                    out.println(toWrite);
                }
                out.println("\r\n");
                for (int i = 0; i < array.length; i++) {
                    String toWrite = stringsDecrypt.decrypt(stringsEncrypt.encrypt(array[i])).toString();
                    out.println(toWrite);
                }
                out.close();
            }catch (IOException e){
                System.out.println("[ERROR]: Unfortunately IOException is occurred :( ");
            }
        }

}


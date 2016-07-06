package com.goit.lessons.homeWork.modules09;


import java.util.ArrayList;

public class CaesarMain {

    public String[] FillList(){
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("AudioFile, Yesterday, .mp3");
        arrayList.add("AudioFile, Submarine, .mp3");
        arrayList.add("ImageFile, SomeSong, .png");
        arrayList.add("TextFile, SomeText, .txt");

        String[] array = new String[arrayList.size()];

        for (int i = 0; i < array.length; i++){
            array[i] = arrayList.get(i);
            System.out.println("String = " + array[i]);
        }

        return array;
    }

    public static void main(String[] args) throws Exception {

        CaesarMain caesarMain = new CaesarMain();
        StringsEncrypt stringsEncrypt = new StringsEncrypt(23, 1);
        StringsDecrypt stringsDecrypt = new StringsDecrypt(23, 1);

        String[] array = caesarMain.FillList();

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Encrypted string is: " +
                    stringsEncrypt.encrypt(array[i]));
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Decrypted string is: " +
                    stringsDecrypt.decrypt(stringsEncrypt.encrypt(array[i])));
        }

    }
}

package com.goit.lessons.homeWork.modules09;

public class StringsDecrypt {
    private  final String ALPHABET_UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String alphabetUpperCaseShifted;

    private final String ALPHABET_LOWER_CASE = "abcdefghijklmnoprqstuvwxyz";
    private String alphabetLowerCaseShifted;

    private final String DIGITS = "0123456789";
    private String digitsShifted;


    public StringsDecrypt(int keyLetter, int keyDigit){
        if(keyLetter < 0 || keyLetter > 26){
            System.err.println("[ERROR]: key to shift letter must be from [0, 26]");
        }
        if(keyDigit < 0 || keyDigit> 10){
            System.err.println("[ERROR]: key to shift digit chars must be from [0, 10]");
        }
        alphabetUpperCaseShifted = ALPHABET_UPPER_CASE.substring(26 - keyLetter) +
                ALPHABET_UPPER_CASE.substring(0, 26 - keyLetter);
        alphabetLowerCaseShifted = ALPHABET_LOWER_CASE.substring(26 - keyLetter) +
                ALPHABET_LOWER_CASE.substring(0, 26 - keyLetter);

        digitsShifted = DIGITS.substring(10 - keyDigit) + DIGITS.substring(0, 10 - keyDigit);
    }

    public StringBuilder decrypt (StringBuilder stringBuilderEncrypt){
        StringBuilder stringBuilderDecrypt = new StringBuilder(stringBuilderEncrypt);

        for (int i = 0; i < stringBuilderEncrypt.length(); i++){
            char currentChar = stringBuilderEncrypt.charAt(i);

            if (Character.isUpperCase(currentChar)){
                int index = ALPHABET_UPPER_CASE.indexOf(currentChar);
                if (index != -1){
                    char newChar = alphabetUpperCaseShifted.charAt(index);
                    stringBuilderDecrypt.setCharAt(i, newChar);
                }
            }
            if (Character.isLowerCase(currentChar)){
                int index = ALPHABET_LOWER_CASE.indexOf(currentChar);
                if (index != -1){
                    char newChar = alphabetLowerCaseShifted.charAt(index);
                    stringBuilderDecrypt.setCharAt(i, newChar);
                }
            }
            if (Character.isDigit(currentChar)){
                int index = DIGITS.indexOf(currentChar);
                char newChar = digitsShifted.charAt(index);
                stringBuilderDecrypt.setCharAt(i, newChar);
            }
        }
        return stringBuilderDecrypt;
    }
}

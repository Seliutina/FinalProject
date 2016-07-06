package com.goit.lessons.homeWork.modules09;

public class StringsEncrypt{

    private  final String ALPHABET_UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String alphabetUpperCaseShifted;

    private final String ALPHABET_LOWER_CASE = "abcdefghijklmnoprqstuvwxyz";
    private String alphabetLowerCaseShifted;

    private final String DIGITS = "0123456789";
    private String digitsShifted;

    public StringsEncrypt(int keyLetter, int keyDigit){
        if(keyLetter < 0 || keyLetter > 26){
            System.err.println("[ERROR]: key to shift letter must be from [0, 26]");
        }
        if(keyDigit < 0 || keyDigit> 10){
            System.err.println("[ERROR]: key to shift digit chars must be from [0, 10]");
        }
         alphabetUpperCaseShifted =  ALPHABET_UPPER_CASE.substring(keyLetter) +
                ALPHABET_UPPER_CASE.substring(0, keyLetter);

         alphabetLowerCaseShifted = ALPHABET_LOWER_CASE.substring(keyLetter) +
                ALPHABET_LOWER_CASE.substring(0, keyLetter);

         digitsShifted = DIGITS.substring(keyDigit) + DIGITS.substring(0, keyDigit);
    }

    public StringBuilder encrypt (String string){

        StringBuilder stringBuilderEncrypt = new StringBuilder(string);

        for (int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);

            if (Character.isUpperCase(currentChar)){
                int index = ALPHABET_UPPER_CASE.indexOf(currentChar);
                if (index != -1){
                    char newChar = alphabetUpperCaseShifted.charAt(index);
                    stringBuilderEncrypt.setCharAt(i, newChar);
                }
                else System.err.println("[WARNING]: some letters not from English alphabet,weren't encrypted");
            }
            if (Character.isLowerCase(currentChar)){
                int index = ALPHABET_LOWER_CASE.indexOf(currentChar);
                if (index != -1){
                    char newChar = alphabetLowerCaseShifted.charAt(index);
                    stringBuilderEncrypt.setCharAt(i, newChar);
                }
                else System.err.println("[WARNING]: some letters not from English alphabet, weren't encrypted");
            }
            if (Character.isDigit(currentChar)){
                int index = DIGITS.indexOf(currentChar);
                    char newChar = digitsShifted.charAt(index);
                    stringBuilderEncrypt.setCharAt(i, newChar);
            }
        }
        return stringBuilderEncrypt;
        }
    }


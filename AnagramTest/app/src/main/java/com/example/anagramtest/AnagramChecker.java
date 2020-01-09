package com.example.anagramtest;

public class AnagramChecker {

    public static boolean isValidAnagram(String sourceString, String anagramString) {
        boolean isAnagram;

        char[] sourceChars = sourceString.toLowerCase().toCharArray();
        char[] anagramChars = anagramString.toLowerCase().toCharArray();

        if (sourceChars.length == anagramChars.length) {
            int count = 0;

            for (char sourceChar : sourceChars) {
                for (char anagramChar : anagramChars) {
                    if (sourceChar == anagramChar) {
                        count++;
                        break;
                    }
                }
            }

            if (count == sourceChars.length) {
                isAnagram = true;
            } else {
                isAnagram = false;
            }
        } else {
            isAnagram = false;
        }

        return isAnagram;
    }
}

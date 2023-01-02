package com.bhoomi;

import java.util.Locale;

public class Jan02 {
    public static void main(String[] args) {

        String word  = "FlaG";
        String word1 = "ggg";
        System.out.println(detectCapitalUse(word));
        System.out.println(detectCapitalUse(word1));

    }
    static boolean detectCapitalUse(String word){
        return word.equals(word.toUpperCase()) || word.substring(1).equals(word.substring(1).toLowerCase());
    }
}

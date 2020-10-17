package com.example.madt0621;

public class WordCounter {
    public static int getWordsCount(String text){
        String[] WC = text.split(" ");
        final int length = WC.length;
        return length;
    }
}

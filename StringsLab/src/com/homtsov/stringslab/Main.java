package com.homtsov.stringslab;

public class Main {
    public static void main(String[] args) {
        String pattern = "pata";
        String text = "abofgfgfgbapataparaparam";

        BoyerMoore boyermoore1 = new BoyerMoore(pattern);
        int offset1 = boyermoore1.search(text);

        // print results
        System.out.println("text:    " + text);

        System.out.print("pattern: ");
        for (int i = 0; i < offset1; i++)
            System.out.print(" ");
        System.out.println(pattern);

    }
}
package com.lakshay.play;

import com.lakshay.play.strings.StringProblems;

public class DriverStrings {
    public static void main(String[] args) {
        StringProblems stringProblems = new StringProblems();
        stringProblems.printCharWithFreq("phqgh");
        //output
        //g1h2p1q1
        System.out.println("");
        System.out.println("==========================");
        String outputBinary = stringProblems.addBinary("101111", "10");
        System.out.println("output " + outputBinary);
        System.out.println("==========================");
    }
}

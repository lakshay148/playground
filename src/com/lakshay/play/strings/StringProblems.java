package com.lakshay.play.strings;

import java.util.Map;
import java.util.TreeMap;

public class StringProblems {
    public  void printCharWithFreq(String str)
    {
        // size of the string 'str'
        int n = str.length();

        // 'freq[]' implemented as hash table
        int[] freq = new int[26];

        // accumulate freqeuncy of each character
        // in 'str'
        for (int i = 0; i < n; i++)
            freq[str.charAt(i) - 'a']++;

        // traverse 'str' from left to right
        for (int i = 0; i < n; i++) {

            // if frequency of character str.charAt(i)
            // is not equal to 0
            if (freq[str.charAt(i) - 'a'] != 0) {

                // print the character along with its
                // frequency
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");

                // update frequency of str.charAt(i) to
                // 0 so that the same character is not
                // printed again
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
        TreeMap<Character, Integer> frequencyMap = new TreeMap<>();
        for(int i=0;i<str.length();i++){
            if(frequencyMap.containsKey(str.charAt(i))){
                int count = frequencyMap.get(str.charAt(i));
                frequencyMap.put(str.charAt(i), count+1);
            } else {
                frequencyMap.put(str.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            System.out.print(entry.getKey()+entry.getValue());
        }
    }
}
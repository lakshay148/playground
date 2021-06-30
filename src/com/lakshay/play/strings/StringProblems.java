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

    public String addBinary(String a, String b) {
        if(b.length() > a.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        int carry = 0;
        String output = "";
        int i = a.length()-1;
        int j = b.length()-1;
        for (; i>=0 && j>=0;i--,j--){
            if(Integer.parseInt(a.charAt(i)+"") == 1 && Integer.parseInt(b.charAt(j)+"") == 1){
                if(carry == 0) output = '0' + output;
                else output = '1'+ output;
                carry = 1;
            } else if( Integer.parseInt(a.charAt(i)+"") == 1 || Integer.parseInt(b.charAt(j)+"") == 1){
                if(carry == 0){
                    output = '1' + output;
                } else {
                    carry = 1;
                    output = '0' + output;
                }
            } else {
                if(carry == 1) output = '1'+output;
                else output = '0'+output;
                carry = 0;
            }
        }
        while(i>=0){
            if(Integer.parseInt(a.charAt(i)+"") == 1){
                if(carry == 1){
                    output = '0'+output;
                } else {
                    output = '1'+output;
                    carry = 0;
                }
            } else {
                if(carry == 1){
                    output = '1'+output;
                    carry = 0;
                } else {
                    output = '0'+output;
                }
            }
            i--;
        }
        if(carry == 1)
            output = '1'+ output;
        return output;
    }
}
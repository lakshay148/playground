package com.lakshay.play;

import com.lakshay.play.arrays.ArrayProblems;

public class DriverArrays {
    public static void main(String[] args){
        System.out.println("Program started");
        int[] input = new int[]{1, 2, 2, 4, 5, 5,7};
        ArrayProblems driver = new ArrayProblems();
        int[] output = driver.rotateArray(input, input.length, 15);
        for(int i : output){
            System.out.print(i);
        }
    }
}

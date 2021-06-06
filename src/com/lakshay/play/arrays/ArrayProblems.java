package com.lakshay.play.arrays;

public class ArrayProblems {
    public int[] rotateArray(int[] input, int n, int d){
        //rotate by d
        //array size n
        if(input == null) return null;

        if(d == n) return input;

        d = d%n;

        int[] auxArray = new int[d];
        for(int i=0; i<d;i++){
            auxArray[i] = input[i];
        }
        for(int j=d, i=0; j<n;i++, j++){
            input[i] = input[j];
        }
        for(int k=0, i=n-d; k<auxArray.length;i++, k++){
            input[i] = auxArray[k];
        }
        return input;
    }
}

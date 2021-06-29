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

    public int searchInsert(int[] nums, int target) {
        if(nums == null ) return 0;
        if(nums.length == 1){
            if(nums[0] >= target) return 0;
            return 1;
        }

        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) start = mid+1;
            else end = mid-1;
        }
        if(end == nums.length-1 && nums[end]<target) return nums.length;
        if(start == 0 && nums[start] > target) return 0;
        if(target < nums[start]) return start+1;
        return start+1;
    }


}

package com.lakshay.play;

import com.lakshay.play.heaps.StoneWeight;

public class DriverHeaps {
    public static void main(String[] args) {
        StoneWeight sw = new StoneWeight();
        int[] stones = new int[]{2,7,4,1,8,1};
        int weight = sw.lastStoneWeight(stones);
        System.out.println("final weight " + weight);
    }
}

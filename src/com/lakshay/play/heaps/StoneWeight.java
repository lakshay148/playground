package com.lakshay.play.heaps;

import java.util.PriorityQueue;

/*Input: [2,7,4,1,8,1]
        Output: 1
        Explanation:
        We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
        we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
        we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
        we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.

 */

public class StoneWeight {
    PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->b-a);
    public int lastStoneWeight(int[] stones) {
        for(int i : stones){
            queue.offer(i);
        }
        while(queue.size() > 1){
            int x = queue.poll();
            int y = queue.poll();
            if(x != y)
                queue.offer(Math.abs(x-y));
        }
        return queue.peek();
    }
}

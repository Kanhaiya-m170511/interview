package com.interview.test.kal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {

    // Given -- Queue of integers and one Integer  (K) --
    // reverse the order of first K elements of the Queue

    // Input : [1,2,3,4,5,6,7] , k = 3
    //Output : [3,2,1,4,5,6,7]

    // 1,2,3 --- Stack
    // 4,5,6,7 --- Queue --

    //3,2,1,4,5,6,7 --

    // O(n) -- Time

    // O(n) -- Space

   // -----------------------------
    // Take a Stack  --  [1,2,3]

    // 4,5,6,7

    // 4,5,6,7,3,2,1
    // 3,2,1,4,5,6,7

    // O(n) and O(k)
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            queue.add(i+1);
        }
        System.out.println(queue);
        reverseKFromQueue(queue,5);
        System.out.println(queue);
    }
    public static void reverseKFromQueue(Queue<Integer> queue, int k){
        Stack<Integer> stack = new Stack<>();
        int x = k;

        while(x > 0 && !queue.isEmpty()){
            stack.push(queue.poll());
            x--;
        }

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        x = 0;
        while(x < queue.size()-k){
            queue.offer(queue.poll());
            x++;
        }
    }
}

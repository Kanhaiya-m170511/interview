package com.interview.test.nobroker;

/*

You are given a 0-indexed array of integers nums of length n.
You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i.

In other words, if you are at nums[i], you can jump to any nums[i + j] where: 0 <= j <= nums[i] and i + j < n

Return the minimum number of jumps to reach nums[n - 1].

The test cases are generated such that you can reach nums[n - 1].



Example 1:

Input: nums = [2,3,1,1,4]
Output: 2

Explanation: The minimum nu


[2,3,1,1,4]

initial = nums[0] = 2 ,,,, 0+1 < 5   ---1

next Jump == nums[1] = 3 ,,,, 1+3 < 5 ---2


	int initial = nums[0];
// for(int i = 1; i < nums.lnegth; i++){
	// next max -- 3

}
----
[1,1,1,1,1]
Output:4

 */
public class MinJump {
    public static void main(String[] args) {
        int[] arr= {1,1,1,1,1};
        System.out.print(getMinJump(arr));
    }
    private static int getMinJump(int[] arr){

        int minJump = 0;
        int initial = arr[0];
        int nextMaxIdx = -1;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length;i++){
            if(max <= arr[i]){
                max = arr[i];
                nextMaxIdx = i;
            }
            if(i > initial){
                i = nextMaxIdx;
                initial= max;
                minJump++;
            }
        }
        return minJump;

    }
}

package com.interview.test.nobroker;
/*



Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]


Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]


Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]

Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100


----

1,2,3,4,5,6,7 , k = 3

7,6,5,4,3,2,1 -- Reve


5,6,7,4,3,2,1 -- 0, k-1


5,6,7,1,2,3,4 -- k, n
 */
public class Array {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int k = 2;
        arr = getRotatedArray(arr,k);
        for(int i = 0; i < arr.length;i++)
            System.out.print(arr[i]+" ");

    }
    private static int[] getRotatedArray(int[] arr, int k){
        arr = reverse(arr,0,arr.length-1);
        arr = reverse(arr, 0, k-1);
        arr = reverse(arr, k, arr.length-1);
        return arr;
    }
    // 5,4,3,2,1  --- 0, 4
    private static int[] reverse(int[] arr, int l, int r){
        if(l >= r)return arr;

        arr[l] = arr[l] + arr[r]; // 6
        arr[r] = arr[l] - arr[r]; // 2
        arr[l] = arr[l] - arr[r]; // 4

        reverse(arr,l+1,r-1);
        return arr;
    }
    // a = 100, b = 10-----
    // a =  a+b // 110
    // b =  a-b // 100
    // a =  a-b // 10
}

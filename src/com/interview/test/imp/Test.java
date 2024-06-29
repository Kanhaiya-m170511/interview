package com.interview.test.imp;

import com.interview.test.nobroker.Array;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // [2,4,3,1,34,0] , nth Largest Element = 2
        // 1

        // Sorting not

        //


    }
    public static int getSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondLargest = max;
        ArrayList<Integer> integers=new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){

                secondLargest = max;
                max = arr[i];
            }
            // [2,4,1,34,0,34]
           // if(arr[i] == max &&)
        }
        return secondLargest;
    }
    public static int getNthLargest(int[] arr, int n, int k){
        if(n == 0) return arr[0];
        // [2,4,1,34,0,34]
        return 0;
    }
}

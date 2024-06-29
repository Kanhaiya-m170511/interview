package com.interview.test.bigbascket;

public class Test {
//Input : [1,0,3,4]
//: [0,12,0,0]

   // Input : [1,2,3,4]
    //Output : [24, 12, 8, 6]

    public static void main(String[] args) {

    }
    public static int[] getProd(int[] arr){

        int prod = 1;
        int noOfZeros = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                prod *= arr[i];
            } else {
                noOfZeros++;
            }
        }

        int[] res = new int[arr.length];
        if(noOfZeros > 1)
            return res;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0){ // noOfZeros=1, [1,0,3,4]   -- 12 -- [12,12,4,3]
                res[i] = prod;
            } else {
                if(noOfZeros == 0) //[]
                    res[i] = prod / arr[i];
            }
        }
        return res;
    }
}

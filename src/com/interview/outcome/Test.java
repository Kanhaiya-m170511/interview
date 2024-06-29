package com.interview.outcome;

import java.util.ArrayList;
import java.util.List;

// [[1,2,3,4,5],[2,3,4,5,6]]
// [1,2,3,4,5,2,3,4,5,6]
public class Test {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,3,4,5},
                {2,3,4,5,6}
        };
        List<Integer> res = new ArrayList<>();
        for(int[] arrTemp : arr){
            for(int x : arrTemp){
                res.add(x);
            }
        }
        System.out.println(res);
    }
}


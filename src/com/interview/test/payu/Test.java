package com.interview.test.payu;


// Given an integer n,
// return the least number of perfect square numbers that sum to n.
// N = 13  : 2
// N = 12  : 3
// N
//A perfect square is an integer that is the square of an integer;
// in other words, it is the product of some integer with itself.
// For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

import java.util.*;

public class Test {

//    Sum(N,sum)
//        if(sum == N)return;
//        For x = 1 to N
//            sum(N,sum+x*x);
//        //    13
//        //  1, 4, 9
//        //  2  2  3 3
//
//    }





    //You are given an array of strings words (0-indexed).
    //In one operation, pick two distinct indices i and j,
    // where words[i] is a non-empty string,
    // and move any character from words[i] to any position in words[j].
    //
    //Return true if you can make every string in
    // words equal using any number of operations, and false otherwise.

    //Input: words = ["aabc","aabc","aabc"]
    //Output: true

    //Input: words = ["ab","a"]
    //Output: false

    // ["ab","aabc","bc"]
    // Output : false;

    public static void main(String[] args) {
        System.out.println(new Test().isEqual(List.of("ab","aabc","bc")));
        System.out.println(new Test().isEqual(List.of("aabc","aabc","aabc")));
        System.out.println(new Test().isEqual(List.of("ab","a")));
    }

    public boolean isEqual(List<String> list){
        HashMap<Character,Integer> maps = new HashMap<>();

        for(String str : list){
            int i = 0;
            while(i < str.length()){
                char ch = str.charAt(i);
                int x = maps.getOrDefault(ch,0);
                maps.put(ch,x+1);
                i++;
            }
        }

        for(Map.Entry<Character,Integer> entry : maps.entrySet()){
            if(entry.getValue() % list.size() != 0) return false;
        }
        return true;
    }
}

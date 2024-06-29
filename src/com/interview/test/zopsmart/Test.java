package com.interview.test.zopsmart;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
//    Compress string
//    Input = aaaaaaaaaa bbbbb ccc aaaa cc abc
//
//    Output = 10a5b3c4a2cabc


    String compress(String s){// aaaaaaaaa ab bbbbcccaaaacc  abc
        StringBuilder res = new StringBuilder();
        int i = 1;
        char ch = s.charAt(0);
        int freq = 1;
        while( i < s.length()){
            if(ch == s.charAt(i)){
                freq++;
            } else {
                if(freq == 1) res.append(ch);
                else
                    res.append(String.valueOf(freq)).append(ch);
                ch = s.charAt(i);
                freq=1;
            }
            i++;
        }

        if(freq == 1) res.append(ch);
        else res.append(String.valueOf(freq)).append(ch);


        return res.toString();

    }













//    Decompress string
//
//    Input= 10a5b3c4a2c   abc
//
//    Output= aaaaaaaaaabbbbbcccaaaaccabc


    String decompress(String str){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            int n=1;
            char ch = str.charAt(i);
            int num = 0;
            while( ch >= '0' && ch <='9'){
                // get the num
                i++;
                int x =(ch)-48;
                ch = str.charAt(i);
                num = num * 10 + x ;

            }

            if(num != 0) n = num;
            while(n > 0){
                sb.append(ch);
                n--;
            }
            i++;
        }

        return sb.toString();
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){

        }
        Map<Integer,String> map = new HashMap<>();
        map.put(10,"Kanha");
        map.put(20,"Kumar");
        map.put(30,"Anc");
        LinkedHashMap<Integer, String> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));


        System.out.println(sortedMap);

        return null;

    }








//
//    Return the largest sum from contiguous sub-array
//    Input = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//
//
//
//    Output = 6
//
//    Return the largest sum from contiguous sub-array
//    Input = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//
//
//
//    Output = 6

    int  getMaxSubArraySum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            ans  = Math.max(ans,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }

// O(n)

    public static void main(String[] args) {
        System.out.println(new Test().decompress("10a5b3c4a2cabc"));
        new Test().topKFrequent(new int[]{1,2},0);
    }
}

package com.interview.test.epam;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args){

        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 ,1};
        List<Integer> list = Arrays.stream(arr)
                                            .boxed()
                                            .collect(Collectors.toList());

        TreeSet<Integer> set = new TreeSet<>(list);
        for(Integer x : set){
            System.out.println("element="+x+" first-index="+list.indexOf(x)+", last-index="+list.lastIndexOf(x));
        }

        HashMap<Integer,Integer> map= new HashMap<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

        }

    }
}
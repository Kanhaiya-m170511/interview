package com.interview.test.paypal;

import java.util.*;

public class Test {
    // given , list of integers
    // output the max product , that is possible with pairs of numbers (2 no.)
    //1,2,3,4,67,21,0
    // 67*21
    //1,2,3,4,-67,-21,0
    // -67 * -21
    //

    // 0, 1, 2, 3, 4 , 4

    public static void main(String[] args) {
        int[] arr= new int[]{-1,-1,67,1,2,3,4,67,21,67,0};

        System.out.println(getMaxProd(arr));
        findCircularDependency();
    }

    public static int getMaxProd(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (secondSmallest > arr[i]) {
               secondSmallest = arr[i];
            }

            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Smallest :: "+smallest+" && Second Smallest :: "+secondSmallest);
        System.out.println("Largest :: "+largest+" && Second Largest :: "+secondLargest);

        return Math.max(secondSmallest*smallest,largest*secondLargest);
    }

    public static int findCircularDependency(){
        Map< String, List<String>> depMap = new HashMap<>();
        depMap.put("A", Arrays.asList("B","C","D"));
        depMap.put("B", Arrays.asList("D","E"));
        depMap.put("D", Arrays.asList("A"));

        HashMap<String,Boolean> visited = new HashMap<>();
        for(Map.Entry<String,List<String>> entry : depMap.entrySet()){
            visited.put(entry.getKey(),false);
        }


        Stack<String> stack = new Stack<>();
        Map.Entry<String,List<String>> firstEntry = depMap.entrySet().stream().findFirst().get();

        System.out.println(firstEntry);
        //visited[0] = true;
        visited.put(firstEntry.getKey(),true);


        return 0;
    }




}

class Testt {

    public synchronized void m1(){

    }

    public static synchronized void m2(){

    }

    public static void main(String[] args) {
        Thread t1;
        Thread t2;

    }
}

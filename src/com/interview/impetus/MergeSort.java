package com.interview.impetus;

// [10,13,11,2,21,34,45]
// [2,10,11,13,21,34,45]
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{
                10,13,11,2,21,34,45
        };
        printArray(arr);
        mergeSort(arr,0,arr.length-1);
        printArray(arr);

    }

    public static void mergeSort(int[] arr,int left, int n){
        // 10,13,11,2,21,34,45
        // 10,13,11,2  ---  21,34,45

        // 10 -- 13 -- 11 -- 2 --- 21, 34

        //  0, mid , mid+1 , n
        if(left >= n){
            return;
        }

        int mid = (left+n)/2; // 3
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,n);
        merge(arr,left,mid,n);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        // left , mid, right


    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // 1 -> 2 -> 3
    // 3-> 2 ->1
    /*
    reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head; // 1
        while(curr != null){ //
            ListNode temp = curr->next; // 2
            curr->next = prev; // null
            prev = curr; // 1
            curr = temp;
        }
    }
     */
}

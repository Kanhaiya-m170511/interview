package com.interview.test.zet;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                        {1,2,3}, // 1, 4, 7
                        {4,5,6}, // 2, 5, 8
                        {7,8,9} //  3, 6, 9
                    };
        print(mat);

        rotateMatrixBy90(mat);


        print(mat);
    }
    private static void print(int[][] mat){
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[r].length; c++){
                System.out.print(mat[r][c]+",");
            }
            System.out.println();
        }
    }
    private static void rotateMatrixBy90(int[][] mat){
        // find transpose
        for(int r = 0 ; r < mat.length; r++){
            for(int c = r ; c < mat[r].length; c++){
                if(r != c){
                    int temp = mat[r][c];
                    mat[r][c] = mat[c][r];
                    mat[c][r] = temp;
                }
            }
        }

        for(int r = 0; r < mat.length; r++){
            reverse(mat[r]);
        }

    }
    private static void reverse(int[] arr){ // 1,2,3,4 -- 4,3,2,1
        int l = 0, r = arr.length-1;
        while(l < r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;r--;
        }
    }
}

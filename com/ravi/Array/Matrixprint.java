package com.ravi.Array;

public class Matrixprint {

    static void printArray(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        int[][] arr ={ {1,5,6},
                        {3,7,9},
                        {2,5,8}
                        };
        printArray(arr);
    }
    
}

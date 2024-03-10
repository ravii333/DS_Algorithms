package Recursion;

import java.util.Scanner;

public class ArrayRecursion{ // By recursion
    static int sumOfarray(int[] arr,int index){
        if(index==arr.length){ 
           return 0;
        }
      int smallAns = sumOfarray(arr, index+1);   
        return smallAns + arr[index];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        int index=0;
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Sum of Array is :");
        System.out.println(sumOfarray(arr, index));
        scan.close();
    }
    
}

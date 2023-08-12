package Arrays;

import java.util.Scanner;

public class sumOfArray {

     static int  sumArray(){

        int[] arr = new int[5];
         int sum=0;
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++){
            Scanner sc = new Scanner(System.in);
             arr[i] = sc.nextInt();
              sum = sum + arr[i];
        }
        System.out.println("Sum of all elements of array is  "+sum);
         return sum;
     }

    public static void main(String[] args) {
         sumArray();
    }
}

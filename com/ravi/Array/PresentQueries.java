package com.ravi.Array;
import java.util.Scanner;

public class PresentQueries {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] freq=makeFrequencyArray(arr);
        System.out.println("Enter number of queries ");
        int q=sc.nextInt();
        while( q > 0){
            System.out.println("Enter number to be searched ");
            int num = sc.nextInt();
            if(freq[num]>0){
                System.out.println("Number is present");
            }
            else{
                System.out.println("Number is not present");
            }
            q--;
        }
    }
}

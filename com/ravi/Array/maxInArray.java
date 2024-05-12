package com.ravi.Array;

import java.util.Scanner;

public class maxInArray {

    static void maxOfarray() {

        int arr[] = new int[5];
        int ans = 0;
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            Scanner read = new Scanner(System.in);
            arr[i] = read.nextInt();
            if (ans < arr[i]) {
                ans = arr[i];
            }
            read.close();
        }
        System.out.println("Max is " + ans);

    }

    public static void main(String[] args) {
        maxOfarray();

    }
}

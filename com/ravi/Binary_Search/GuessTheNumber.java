package com.ravi.Binary_Search;

import java.util.Scanner;

public class GuessTheNumber {
    static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high) {
            int mid = (low + high) / 2;
            int guessed_number = arr[mid];
            if (guessed_number == target) return mid;
            else if (guessed_number > target) {
                high = mid - 1;
            } else low = mid + 1;
        }
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lists = {1, 3, 5, 7, 9};
        System.out.println("Enter the Number you want to be searched: ");
        int number = sc.nextInt();
        int index = search(lists,number);
        System.out.println("Index of target is " +index);
    }
}

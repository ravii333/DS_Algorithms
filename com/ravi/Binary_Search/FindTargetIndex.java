package com.ravi.Binary_Search;

// FIND THE INDEX OF TARGET ELEMENT IN THE ARRAY

public class FindTargetIndex {
    static void displayArray(int[] array) {
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }

    static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <= arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("Given Array :");
        displayArray(arr);
        int target = 4;
        System.out.println("\nIndex of target element: " + findIndex(arr, target));
    }
}

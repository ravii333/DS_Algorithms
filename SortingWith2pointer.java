package Arrays;
import java.util.Scanner;

public class SortingWith2pointer {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void swap(int[] arr,int left ,int right ){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
              left++;
            }
            if(arr[right]==1){
                right--;            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+ " elements (only 0's and 1's):");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
        sortZeroesAndOnes(arr);
         System.out.println("/nSorted Array");
         printArray(arr);
    }
}

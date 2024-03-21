package Arrays;
import java.util.Scanner;

public class SortingZerosAndOnes {
    static void printArray(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
        static void sortZeroesAndOnes(int[] arr){
            int n= arr.length;
            int zeroes=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    zeroes++;
                }
            }
            for(int i=0;i<n;i++){
                if(i<zeroes){
                    arr[i]=0;
                }
                else{
                    arr[i]=1;
                }
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n+ " elements(only 0's and 1's):");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
        sortZeroesAndOnes(arr);
        System.out.println("\nSorted array");
        printArray(arr);
    } 
}

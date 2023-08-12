package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class CloneArray {

    //Clone an Array using clone()method:

    static void printArray(int[] arr){
        int n= arr.length;
        for( int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        System.out.println("Enter "+n+ " elements" );
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original Array");
        printArray(arr);
        System.out.println("Cloned Array");
        int[] arr_2= arr.clone();
        printArray(arr_2);  
    }
    
}

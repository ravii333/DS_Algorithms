
import java.util.Scanner;

public class CopyArray {

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+ " elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array:");
        printArray(arr);
        sc.close();
    }
    
}

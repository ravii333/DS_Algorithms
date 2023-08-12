package Arrays;
import java.util.Scanner;

public class ArrayIsSorted {

    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Is Array Sorted : "+isSorted(arr));
    }
}

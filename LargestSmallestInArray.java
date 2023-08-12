package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class LargestSmallestInArray {
    static int[] smallestLargestInArray(int[] arr){
       Arrays.sort(arr);
       int[] ans = {arr[0], arr[arr.length-1]};
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Array size ");
        int n = sc.nextInt();
         System.out.println("Enter "+n+" elements");
         int[] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         }
         int[] ans = smallestLargestInArray(arr);
          System.out.println("Smallest: "+arr[0]);
        System.out.println("Largest: "+arr[arr.length-1]);
    }
}

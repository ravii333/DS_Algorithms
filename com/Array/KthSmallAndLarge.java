
import java.util.Scanner;
import java.util.Arrays;

public class KthSmallAndLarge {
    static int[] kthSmallestAndLargestElement(int[] arr, int small, int large) {
        Arrays.sort(arr);
        int[] ans = {arr[small-1], arr[large-1]};
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Value of K for Smallest: ");
        int small = sc.nextInt();
        System.out.println("Value of K for Largest: ");
        int large = sc.nextInt();
        
        int[] ans = kthSmallestAndLargestElement(arr, small, large);
        System.out.println(+small+" smallest element: " + ans[0]);
        System.out.println(+large+" largest element: " + ans[1]);
        sc.close();
    }
}

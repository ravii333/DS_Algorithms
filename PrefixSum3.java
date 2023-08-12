import java.util.Scanner;

public class PrefixSum3 {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static int[] makePrifixSumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
             arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n+ " elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Inserted array:");
        printArray(arr);
       int[] prefSum = makePrifixSumArray(arr);
       System.out.println("\nEnter number of quiries");
       int q = sc.nextInt();
       while(q-- > 0){
        System.out.println("Enter range ");
        int left = sc.nextInt();
        int right = sc.nextInt();
        int ans = prefSum[right] - prefSum[left];
        System.out.println("Sum = "+ans);
       }

    }
    
}

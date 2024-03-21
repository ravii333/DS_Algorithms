import java.util.Scanner;

public class prefixSum2 {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static void makePrifixSumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
             arr[i] = arr[i-1]+arr[i];
        }

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
        makePrifixSumArray(arr);
        System.out.println("\nPrefix sum Array:");
        printArray(arr);

    }
    
}

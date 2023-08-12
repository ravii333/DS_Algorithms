import java.util.Scanner;

public class PrefixSum1 {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    static int[] makePrifixSumArray(int[] arr){
        int n=arr.length;
        int[] pref =new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
             pref[i] = pref[i-1]+arr[i];
        }
        return pref;

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
        int[] pref = makePrifixSumArray(arr);
        System.out.println("\nPrefix sum Array:");
        printArray(pref);

    }
    
}

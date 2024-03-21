import java.util.Scanner;

public class PrefixSum4 {
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for(int i=0; i<arr.length;i++){
            totalSum = arr[i]+totalSum;
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for(int i=0;i<arr.length;i++){
            prefSum= prefSum+arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum==prefSum){
                return true;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size ");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        System.out.println("Enter " +n+ " elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible : " +equalSumPartition(arr));
    }
    
}

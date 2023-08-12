package Arrays;
import java.util.Scanner;

public class twoSum {
    static void targetSum(int[] arr,int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Target="+target);
                    System.out.println("["+i+","+j+"]");
                }
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your target:");
        int target =sc.nextInt();
        targetSum(arr,target);
    }
    
}

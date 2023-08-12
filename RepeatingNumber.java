package Arrays;
import java.util.Scanner;

public class RepeatingNumber {
    static int firstRepeatingNumber(int[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[j]==arr[i]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter array size:");
        int n= scan.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("First repeating number of the input array is "+firstRepeatingNumber(arr));
    }
}

package Arrays;
import java.util.Scanner;
public class TripleSum {
    static int tripletSum(int[] arr,int target){
        int ans=0;
        int n= arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if (arr[i] + arr[j]+ arr[k] == target) {
                        System.out.println("The indexes of combinations :"+"[" + i + "," + j + "," + k + "]");
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your target :");
        int target= sc.nextInt();
        tripletSum(arr,target);
    }
}

package Arrays;
import java.util.Scanner;

public class OccurenceOfElement {

    static int occurenceNumber(int[] arr,int elem){
        int count=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==elem){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n+ " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element which occurnce no. you want: ");
        int elem = sc.nextInt();
        int count = occurenceNumber(arr,elem);
        System.out.println("The number of occurence of the " +elem+ " is: "+count);
    }
    
}

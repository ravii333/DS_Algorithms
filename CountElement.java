package Arrays;
import java.util.Scanner;

public class CountElement {

    static int countOfElement(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
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
        System.out.println("Enter the value that compare (greater or not) with all elements: ");
        int x= sc.nextInt();
        int count = countOfElement(arr,x);
        System.out.println("The Elements in Array that is greater than " +x+ " is: "+count);
    }
}

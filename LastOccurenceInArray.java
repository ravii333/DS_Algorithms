
 import java.util.Scanner;
public class LastOccurenceInArray {

    static int lastOccurence(int[] arr,int elem){
        int lastIndex=-1;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==elem){
                lastIndex=i;
            }
        }
        return lastIndex;
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
        int lastIndex = lastOccurence(arr,elem);
        System.out.println("The last index of occurence of the " +elem+ " is: "+lastIndex);
        sc.close();
    }
    
}



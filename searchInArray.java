package Arrays;


import java.util.Scanner;

public class searchInArray {
    static int findElement(int[] arr,int x){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("The Element found in the index is "+i);
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
        System.out.println("Enter searching element");
        int x = scan.nextInt();
        int index = findElement(arr ,x);
    }
}

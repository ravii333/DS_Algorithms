import java.util.Scanner;

public class Matrixprint2 {
    static void printArray(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int r= sc.nextInt();
        System.out.println("Enter column number");
        int c = sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter " +r*c+ " elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your entered 2D array : ");
        printArray(arr, r, c);
    }
    
}

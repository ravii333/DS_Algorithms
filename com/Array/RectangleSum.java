import java.util.Scanner;

public class RectangleSum {
    static int findSum(int[][] matrix ,int l1,int r1,int l2, int r2){
        int sum = 0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum = sum +matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for row and column of a matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter "+row*col+ " elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the co-ordinate of rectangle l1, r1, l2, r2 respectively : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println(" Sum of rectangle elements :"+findSum(arr, l1, r1, l2, r2));
        
    }
}

import java.util.Scanner;

public class RotateMatrix {

    public static void printMatrix(int[][] matrix,int r,int c){
        for(int i= 0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeInplace(int[][] matrix,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[][] matrix){
        int n = matrix.length;
        transposeInplace(matrix, n, n);
        for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int totalElements = r*c;
        int[][] matrix = new int[r][c];
        System.out.println("Enter "+totalElements+" values");
        for(int i= 0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix, r, c);
        rotate(matrix);
        System.out.println("Rotation of matrix");
        printMatrix(matrix, r, c);


    }
    
}

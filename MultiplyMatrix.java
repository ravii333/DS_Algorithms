import java.util.Scanner;

public class MultiplyMatrix {
   // static void checkPossibleOrNot(int r1,int c1,int r2,int c2){
    //    if(c1 != r2){
    //        System.out.println("Invalid inputs of rows And columns-----> Multiplication not possible ");
     //       return;
       // }
    //} 
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
           System.out.println();
        }
        
    }
    static void matrixMultiplication(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
          if(c1 != r2){
           System.out.println("Invalid inputs of rows And columns--> Multiplication not possible ");
          }
        int[][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<r1;k++){
                    mul[i][j] += a[i][j]*b[k][j]; 
                }
            }
        }
        System.out.println("Multiply of  Matrix 1 And 2 :");
         printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows for Matrix 1:");
        int r1 = sc.nextInt();
        System.out.println("Enter column for Matrix 1:");
        int c1= sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter "+r1*c1+ " elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter rows for Matrix 2:");
        int r2= sc.nextInt();
        System.out.println("Enter column for Matrix 2 ");
        int c2 = sc.nextInt();
        //checkPossibleOrNot(r1, c1, r2, c2);
        int[][] b= new int[r2][c2];
        System.out.println("Enter "+r2*c2+ " elements:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);
        matrixMultiplication(a, r1, c1, b, r2, c2);
    }
    
}

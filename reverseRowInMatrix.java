import java.util.Scanner;

public class reverseRowInMatrix {
    static void printMatrix(int[][] matrix,int r,int c){
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
 
    static void findReverse(int[][] mat,int r,int c){
        int start=0;
        int end=c-1;
        for(int i=0;i<r;i++){
            start=0;
            end=c-1;
            while(start<end){
                int temp=mat[i][end];
                mat[i][end]=mat[i][start];
                mat[i][start]=temp;
                start++;
                end--;
            }
        }
        System.out.println("Reversed Row matrix: ");
        printMatrix(mat, r, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r=sc.nextInt();
        System.out.println("Enter no. of column ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter " +r*c+ " elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Inserted Matrix :");
        printMatrix(mat, r, c);

        findReverse(mat, r, c);
    }
}

import java.util.Scanner;

// Pre calculating the horizontal sum for each row in matrix

public class PrefixSumMatrix {
    //Method 2 - by prefix sum calculation

    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        // row-wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
static int findSum2(int[][] matrix,int l1,int r1,int l2,int r2){
    int sum = 0;
    findPrefixSumMatrix(matrix);
    for(int i=l1;i<=l2;i++){
        if(r1>=1){
            sum += matrix[i][r2]-matrix[i][r1-1];
        }
        else{
            sum += matrix[i][r2];
        }
    }
    return sum;
}

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter "+row*col+ " elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Enter rectangle boundries l1,r1,l2 and r2 respectively:");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
 
        System.out.println("Rectangle sum = "+findSum2(arr, l1, r1, l2, r2));
    }
}

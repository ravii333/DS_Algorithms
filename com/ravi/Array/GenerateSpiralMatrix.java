package com.ravi.Array;

import java.util.Scanner;

public class GenerateSpiralMatrix {
    static int[][] printmatrix(int[][] matrix,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        return matrix;
    }
    static int[][] genSpiralMatrix(int[][] spiralmatrix,int n){
        int topRow=0,bottomRow=n-1,leftCol=0;
        int rightCol=n-1,currentElement=1;

        while(currentElement<=n*n){
            for(int j=leftCol;j<=rightCol && currentElement<=n*n;j++){
                spiralmatrix[topRow][j] = currentElement;
                currentElement++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow && currentElement<=n*n;i++){
                spiralmatrix[i][rightCol] = currentElement;
                currentElement++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol && currentElement<=n*n;j--){
                spiralmatrix[bottomRow][j] = currentElement;
                currentElement++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && currentElement<=n*n;i--){
                spiralmatrix[i][leftCol] = currentElement;
                currentElement++;
            }
            leftCol++;
            
        }
        return spiralmatrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n :");
        int n = sc.nextInt();
        int[][] spiralmatrix = new int[n][n];
        spiralmatrix = genSpiralMatrix(spiralmatrix, n);
        System.out.println("The Spiral Matrix :");
        printmatrix(spiralmatrix, n);
    }
}

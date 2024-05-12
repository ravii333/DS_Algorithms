package com.ravi.Array;

import java.util.Scanner;

public class MatrixTranspose {
    public static void printMatrix(int[][] matrix,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int[][] findTransposeMatrix(int[][] mat,int r,int c){
        int[][] transpose = new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                transpose[j][i]=mat[i][j];

            }
        }
        return transpose;

    }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows: ");
    int r = sc.nextInt();
    System.out.println("Enter columns: ");
    int c = sc.nextInt();
    int[][] mat = new int[r][c];
    System.out.println("Enter " +r*c+ " elements: " );
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            mat[i][j] = sc.nextInt();
        }
    }
    System.out.println("Entered Matrix:");
    printMatrix(mat, r, c);
    System.out.println("Transpose Matrix:");
    System.out.print(findTransposeMatrix(mat, r, c));    
 }

}

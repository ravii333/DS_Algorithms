package com.ravi.Recursion;

public class PrintOne_to_N {

    static void printNos(int n){
        if(n<1){
            return;
        }
        printNos(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        printNos(n);
    }
}

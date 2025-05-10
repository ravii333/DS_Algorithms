package com.ravi.Competitive_Programming;

import java.util.Scanner;

public class ElephantMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt();
        int steps = (dist +4)/5;
        System.out.print(steps);
    }

}

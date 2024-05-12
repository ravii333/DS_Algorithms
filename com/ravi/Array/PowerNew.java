package com.ravi.Array;

import java.util.Scanner;

public class PowerNew { //Alternate approach for the calculation of p to the power q with the help of recursive call or function
    static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        int smallPow = pow(p, q/2);
        if(q%2==0){ //for even value
            return smallPow * smallPow;
        }
        else{
            return p *smallPow * smallPow;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of P and Q");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("Power of "+p+ " to the "+q+ " is :");
        System.out.println(pow(p, q));
    }
}

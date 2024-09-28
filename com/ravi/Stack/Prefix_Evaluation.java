package com.ravi.Stack;

import java.util.Stack;

public class Prefix_Evaluation {
    public static void main(String[] args) {
        Stack<Integer> value = new Stack<>();
        String str = "-9/*+5346";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                value.push(ascii-48);
            }
            else {
                int v1= value.pop();
                int v2= value.pop();
                if(ch=='+') value.push(v1+v2);
                if(ch=='-') value.push(v1-v2);
                if(ch=='*') value.push(v1*v2);
                if(ch=='/') value.push(v1/v2);
            }
        }
        System.out.println(value.peek());
    }
}

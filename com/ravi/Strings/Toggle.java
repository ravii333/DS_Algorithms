package com.ravi.Strings;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter String with MixUp of UpperCase and LowerCase :");
        //StringBuilder  str = new StringBuilder(sc.nextLine());
        StringBuilder str = new StringBuilder("KAlayeChasma");
        System.out.println("Given String "+str);
        for(int i=0;i<str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci >= 97) flag = false; //small
            if(flag==true) {
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);
            }
            else{//small
                asci -=32;
                char dh = (char) asci;
                str.setCharAt(i,dh);
            }

        }
        System.out.println(str);
    }
}

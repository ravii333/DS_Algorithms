package Recursion;

import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String str,int left, int right){
        if(left>=right){
            return true;
        }
        return (str.charAt(left)==str.charAt(right) && isPalindrome(str,left +1,right-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str,0,str.length()-1));
    }
}

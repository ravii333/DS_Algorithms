package com.ravi.Strings;

public class CharOccurance {

    static int countOccur(String s, char ch){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(ch == s.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "malyalam";
        char ch = 'm';
        System.out.println(countOccur(str,ch));
    }
}

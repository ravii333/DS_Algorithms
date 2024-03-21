package com.Recursion;
import java.util.ArrayList;
public class Subsequences {
    static ArrayList<String>getSubseQ(String s){
        ArrayList<String>ans = new ArrayList<>();
        //Base Case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char current = s.charAt(0);
        ArrayList<String>smallAns = getSubseQ(s.substring(1));
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(current+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String>ans= getSubseQ("abc");
        for(String ss : ans){
            System.out.println(ss);
        }
    }
}

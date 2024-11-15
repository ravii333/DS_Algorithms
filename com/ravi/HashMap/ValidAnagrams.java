package com.ravi.HashMap;

import java.util.HashMap;

public class ValidAnagrams {
    static  HashMap<Character , Integer> makeFreqMap(String S) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            Character ch = S.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq++);
            }
        }
        return mp;
    }
    public static boolean validAnagram(String str1, String str2){
        if(str1.length()!= str2.length()){
            return false;
        }
        HashMap<Character , Integer> mp1 = makeFreqMap(str1);
        HashMap<Character, Integer> mp2 = makeFreqMap(str2);

        return mp1.equals(mp2);
    }

    public static void main(String[] args) {
        boolean validOrNot =  validAnagram("aacc", "ccac");
        System.out.println("STRINGS ARE ANAGRAM :" +validOrNot);
    }
}

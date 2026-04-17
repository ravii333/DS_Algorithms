package com.ravi.Array;

public class Practice {
    public static void main(String[] args) {
        int[] marks = {34, 67, 78, 90, 19, 45};
        int sum = 0;
        for(int i=0; i<marks.length; i++){
//            if(marks[i]<35) {
                   sum += marks[i];
                // System.out.println("Roll no. :" + i);
            //}
        }
        System.out.println(sum);
    }
}

package Greedy;

import java.util.ArrayList;

public class programmers_makingnumber {
    public static void main(String[] args) {
        System.out.println(Solution1.solution("4177252841",4));
    }

}

class Solution1 {
    public static String solution(String number, int k) {
        String answer = "";

        int[] arr = new int[number.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = number.charAt(i)-'0';
        }


        int start=0;

        for (int end = k+1 ; end < arr.length+1; end++) {
            int index = 0;
            int max = 0;
            for (int j = start; j < end ; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j+1;
                }
            }
            System.out.println(start + " " + end + " " + max + " " + index);
            start = index;
            answer += String.valueOf(max);
        }
        return answer;
    }
}
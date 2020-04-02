package Programmers.SummerWinder_Coding;

import java.util.ArrayList;

public class Q_종이접기 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Solution2.solution(n));
    }

}

class Solution2 {
    public static int[] solution(int n) {
     /*   ArrayList<Integer> al = new ArrayList<>();
        al.add(0); al.add(0); al.add(1);

        int flag = (int)(Math.pow(2,n)-1)/2;
        if(n==1) {
            int[] answer = {0};
            return answer;
        }

        else if(n==2) {
            int[] answer = new int[al.size()];
            for(int i=0; i<answer.length; i++) {
                answer[i] = al.get(i);
            }
            return answer;
        }

        else {
            al.add(0);
            for(int i=flag+1; i<Math.pow(2,n)-1; i++) {
                if(al.get(i/2)==1) { ////////
                    al.add(0);
                }
                else {
                    al.add(1);
                }
            }
        }

        int[] answer = new int[al.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = al.get(i);
        }

        for(int i=0; i<answer.length; i++) {
            System.out.print(" " + answer[i]);
        } */

     StringBuilder sb = new StringBuilder("0");
     while((--n)>0) {
         String str = sb.toString();
         sb.append(0);

         for(int i=str.length()-1; i>=0; i--) {
             if(str.charAt(i) == '0') {
                 sb.append(1);
             }
             else
                 sb.append(0);
         }
     }

     int[] result = new int[sb.length()];
     for(int i=0; i<result.length; i++) {
         result[i] = sb.charAt(i) - '0';
     }

        return result;
    }
}
package Programmers.StackQueue;

import java.util.*;

public class progresses42586 {

    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        System.out.println(Solution.solution(progresses, speeds));
    }
}

class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();
        int N = progresses.length;
        int[][] arrDay = new int[N][2];

        for(int i=0; i<N; i++) {
            int day=0;
            for(int j=progresses[i]; j<100; j++) {
                if(progresses[i] < 100) {
                    progresses[i] += speeds[i];
                    day++;
                }

                else if(progresses[i] >=100) {
                    break;
                }
            }

            arrDay[i][0] = i;
            arrDay[i][1] = day;
        }

     /*   for(int i=0; i<N; i++) {
            int flag = i+1;
            stack.push(arrDay[i][0]);
            for(int j=flag; j<N; j++) {
                if(arrDay[i][1] >= arrDay[flag][1]) {
                    stack.push(arrDay[flag][0]);
                }
                flag++;
            }

            int popDay = 0;
            while(!stack.isEmpty()) {
                stack.pop();
                popDay++;
            }
            System.out.println(popDay);
        } */

     Arrays.sort(arrDay, new Comparator<int[]>() {
         @Override
         public int compare(int[] o1, int[] o2) {
             if(o1[1]==o2[1]) return o1[0]-o2[0];
             return o1[1]-o2[1];
         }
     });

     int flag = 0;
     int start=0;
     for(int i=start; i<N; i++) {
         int popDay = 0;
         stack.push(arrDay[i][0]);
         if(arrDay[i][0] == flag) {
             start=i+1;
             stack.push(arrDay[i][0]);
             while(!stack.isEmpty()) {
                 stack.pop();
                 popDay++;
             }
             flag++;
         }
         System.out.println(popDay);
     }


        return answer;
    }
}
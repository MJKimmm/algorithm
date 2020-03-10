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
        //int[] answer = {};

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

        int cnt=1;
        ArrayList<Integer> popArr = new ArrayList<>();

        for(int i=0; i<arrDay.length; i++) {
            for(int j=i+1; j<arrDay.length; j++) {
                if(arrDay[i][1] < arrDay[j][1]) {
                    break;
                }
                else {
                    cnt++;
                }
            }
            popArr.add(cnt);
            i = cnt+i-1;
            cnt = 1;
        }



        int[] answer = new int[popArr.size()];

        for(int i=0; i<popArr.size(); i++) {
            answer[i] += popArr.get(i);
        }

        for(int i=0; i<popArr.size(); i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }
}
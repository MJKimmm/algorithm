package Programmers.StackQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class printer42587 {

    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(Solution4.solution(priorities,location));
    }
}

class Solution4 {
    public static int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<priorities.length; i++) {
            pq.add(priorities[i]);
        }

        while(!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    if (i == location) {
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }

        return answer;
    }
}
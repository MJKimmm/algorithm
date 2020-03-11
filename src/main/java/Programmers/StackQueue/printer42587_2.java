package Programmers.StackQueue;

import java.util.*;

public class printer42587_2 {

    public static void main(String[] args) {
        int[] priorities = {3,1,2,5,4};
        int location = 0;
        System.out.println(Solution4.solution(priorities,location));
    }

}

class Solution5 {
    public static int solution(int[] priorities, int location) {
        int answer = 1;

        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i=0; i<priorities.length; i++) {
            queue.add(priorities[i]);
        }

        Arrays.sort(priorities);

        int flag = priorities.length;
        while(!queue.isEmpty()) {
            for(int i=flag; i>0; i--) {
                if(priorities[i] == queue.peek()) {
                    if(i==location) { ///////////////////
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
                else {
                    queue.add(queue.poll());
                    flag = i;
                }
            }
        }


        return answer;
    }
}

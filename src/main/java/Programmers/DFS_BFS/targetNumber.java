package Programmers.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class targetNumber {

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(Solution.solution(numbers, target));
    }

}

class Solution {
    static int answer;
    public static int solution(int[] numbers, int target) {
        dfs(numbers, target,0);
        return answer;
    }

    public static void dfs(int[] numbers, int target, int k) {
        int sum=0;
        if(k==numbers.length) {
            for(int i=0; i<numbers.length; i++) {
                sum += numbers[i];
            }

            if(sum==target) {
                answer++;
            }
            return;
        }

        numbers[k] *= 1;
        dfs(numbers, target, k+1);

        numbers[k] *= -1;
        dfs(numbers, target, k+1);
    }

}
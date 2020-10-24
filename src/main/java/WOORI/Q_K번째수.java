package WOORI;

import java.util.Arrays;
import java.util.LinkedList;

public class Q_K번째수 {

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        System.out.println("a");
        System.out.println(Solution.solution(array, commands));
    }

}

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        LinkedList<Integer> li = new LinkedList<>();
        int p,q,r;

        for(int i=0; i<commands.length; i++) {
            p = commands[i][0]; //2
            q = commands[i][1]; //5
            r = commands[i][2];

            li.add(numK(p,q,r,array));
        }

        answer = new int[li.size()];
        for(int i=0; i<li.size(); i++) {
            answer[i] = li.get(i);
        }
        return answer;
    }

    public static int numK(int p, int q, int r, int[] array) {
        int[] partArr = new int[q-p+1];
        int flag = p;
        for(int i=0; i<q-p+1; i++) {
            partArr[i] = array[flag-1];
            flag++;
        }

        Arrays.sort(partArr);

        return partArr[r-1];

    }

}

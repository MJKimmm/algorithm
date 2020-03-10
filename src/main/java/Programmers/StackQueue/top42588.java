package Programmers.StackQueue;

import java.util.ArrayList;

public class top42588 {

    public static void main(String[] args) {
        int[] heights = {6,9,5,7,4};
        System.out.println(Solution2.solution(heights));
    }

}

class Solution2 {
    public static int[] solution(int[] heights) {
        //int[] answer = {};

        int N = heights.length;
        int[][] heightArr = new int[N][2];

        for(int i=0; i<N; i++) {
            heightArr[i][0] = i+1;
            heightArr[i][1] = heights[i];
        }

        ArrayList<Integer> getArr = new ArrayList<>();

        for(int i=N-1; i>0; i--) {
            for(int j= i-1; j>=0; j--) {
                if(heightArr[i][1] < heightArr[j][1]) { // 보낼 수 있다.
                    //System.out.println("send" + heightArr[i][1] + "get " + heightArr[j][0]);
                    getArr.add(heightArr[j][0]);
                    break;
                }

                if(j==0)
                    getArr.add(0);
            }
        }

        int[] answer = new int[getArr.size()+1];
        for(int i=getArr.size()-1; i>=0; i--) {
            answer[getArr.size()-i] = getArr.get(i);
        }

        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}
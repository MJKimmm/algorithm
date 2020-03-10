package Programmers.StackQueue;

import java.util.ArrayList;
import java.util.Stack;

public class top42588_2 {
}


class Solution3 {
    public static int[] solution(int[] heights) {
        int[] answer = {};

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<heights.length; i++) {
            st.push(heights[i]);
        }

        while(!st.isEmpty()) {
            int tmp = st.pop();

            for(int i=st.size(); i>=0; i--) {
                if(tmp < heights[i]) {
                    answer[st.size()] = i+1;
                    break;
                }
            }
        }

        return answer;
    }
}
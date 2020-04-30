package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_N으로표현 {
    static int answer = -1;

    public int solution(int N, int number) {

        dfs(N, number, 0,0);
        return answer;
    }

    static void dfs(int N, int number, int cnt, int prev) {
        int temp_N = N;
        if (cnt>8) {
            answer = -1;
            return;
        }

        if(number==prev) {
            if(answer == -1 || answer > cnt)
                answer = cnt;
            return;
        }

        for(int i=0; i<8-cnt; i++) {
            dfs(N, number, cnt+i+1, prev-temp_N);
            dfs(N, number, cnt+i+1, prev+temp_N);
            dfs(N, number, cnt+i+1, prev*temp_N);
            dfs(N, number, cnt+i+1, prev/temp_N);

            temp_N = increaseNumber(temp_N, N);
        }
    }

    static int increaseNumber(int value, int N) {
        return value*10 + N;
    }

}

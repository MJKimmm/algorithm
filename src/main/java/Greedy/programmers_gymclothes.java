package Greedy;

import java.io.InputStreamReader;
import java.util.Scanner;

public class programmers_gymclothes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        int n = scanner.nextInt();
        int lostCount = scanner.nextInt();
        int[] lost = new int[lostCount];

        for (int i = 0; i < lostCount; i++){
            lost[i] = scanner.nextInt();
        }

        int reserveCount = scanner.nextInt();
        int[] reserve = new int[reserveCount];

        for (int i = 0; i < reserveCount; i++){
            reserve[i] = scanner.nextInt();
        }

        System.out.println(Solution.solution(n, lost, reserve));
    }
}

class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] students = new int[n];
        for(int i=0; i<n; i++) {
            students[i] = 1;
        }

        for(int i=0; i<lost.length; i++) {
            students[lost[i]-1]--;
        }
        for(int i=0; i<reserve.length; i++) {
            students[reserve[i]-1]++;
        }

        for(int i=0; i<n; i++) {
            if(i!=0 && students[i] == 2 && students[i-1] == 0) {
                students[i] = students[i-1] = 1;
            }

            else if(i!=n-1 && students[i] == 2 && students[i+1] ==0) {
                students[i] = students[i+1] = 1;
            }
        }

        for(int i=0; i<students.length; i++) {
            if(students[i] >= 1)
                answer++;
        }


        return answer;
    }
}
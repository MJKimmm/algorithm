package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class programmers_cctv {

    public static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        int[][] routes = new int[N][2];

        for(int i=0; i<N; i++) {
            for (int j=0; j<2; j++) {
                routes[i][j] = scanner.nextInt();
            }
        }

        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) return o1[0] - o1[0];
                return o1[1] - o2[1];
            }
        });

        solution(routes);

    }

    public static int solution(int[][] routes) {
        int answer = 1;

        int end = routes[0][1];
        for(int i=0; i<N-1; i++) {
            if(end < routes[i+1][0]) {
                answer++;
                end = routes[i+1][1];
            }
        }

        System.out.println("answer" +answer);

        return answer;
    }

}
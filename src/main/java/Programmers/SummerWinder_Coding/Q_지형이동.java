package Programmers.SummerWinder_Coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q_지형이동 {
    public static void main(String[] args) {
        int[][] land = {{1, 4, 8, 10}, {5, 5, 5, 5}, {10, 10, 10, 10}, {10, 10, 10, 20}};
        int height = 3;
        System.out.println(Solution3.solution(land, height));

    }

}

class Solution3 {

    static boolean[][] visited;
    static Queue<Pair> queue = new LinkedList<>();
    static ArrayList<Integer> al = new ArrayList<>();
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static int solution(int[][] land, int height) {
        int answer = 0;
        int landLen = land.length;

        visited = new boolean[landLen][landLen];
        for(int i=0; i<landLen; i++) {
            for(int j=0; j<landLen; j++) {
                if(!visited[i][j]) {
                    bfs(i, j, land, height);
                }
            }
        }

        System.out.println(al.size());
        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }
        return answer;
    }

    static void bfs(int i, int j, int[][] land, int height) {
        queue.add(new Pair(i,j));
        visited[i][j] = true;
        int length = land.length;

        int landNum = 1;
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            int x = p.x;
            int y = p.y;

            for(int k=0; k<4; k++) {
                int targetX = x + dx[k];
                int targetY = y + dy[k];

                if(targetX<length && targetY<length && targetX >=0 && targetY >=0) {
                    if(!visited[targetX][targetY] && land[targetX][targetY]-land[x][y] <= height) {
                        queue.add(new Pair(targetX, targetY));
                        visited[targetX][targetY] = true;
                        landNum++;
                    }
                }
            }
        }

        al.add(landNum);

    }



}

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
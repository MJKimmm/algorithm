package Programmers.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class network {
    public static void main(String[] args) {
        int n=3;
        int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};
        System.out.println(Solution2.solution(n, computers));
    }
}

class Solution2 {

    public static boolean[][] visited;
    public static Queue<Pair> queue = new LinkedList<>();
    public static Queue<Pair> networkQ = new LinkedList<>();

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int cnt;

    public static int solution(int n, int[][] computers) {
        int answer = 0;

        queue.add(new Pair(0,0));
        networkQ.add(new Pair(0,0));

        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            int x = p.x;
            int y = p.y;

            for (int i = 0; i < 4; i++) {
                int targetX = x + dx[i];
                int targetY = y + dy[i];

                System.out.println("x" + targetX);
                System.out.println("y" + computers[1][0]);


                if (targetX >= 0 && targetY >= 0 && targetX<n && targetY<n) {
                    if (computers[targetY][targetX] == 1 && !visited[targetY][targetX]) {
                            visited[targetY][targetX] = true;
                            if(targetX!=targetY) { // targetY!=y2 && targetX!=x2
                                cnt++;
                                networkQ.add(new Pair(targetX, targetY));
                            }
                        queue.add(new Pair(targetX, targetY));
                        //computers[targetY][targetX] = computers[y][x] + 1;
                    }
                }
            }


        }



        return cnt;
    }
}

class Pair {
    int x;
    int y;

    Pair(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class mazeSearch_2178 {

    public static int[][] maze;
    public static boolean[][] visited;
    public static int N, M, cnt;

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static Queue<Pair2> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String str2 = br.readLine();
            //System.out.println(str2);
            for(int j=0; j<M; j++) {
                maze[i][j] = str2.charAt(j) - '0';
            }
        }

        queue.add(new Pair2(0,0));

        while(!queue.isEmpty()) {
            Pair2 p = queue.poll();
            int x = p.x;
            int y = p.y;

            for(int i=0; i<4; i++) {
                int targetX = x + dx[i];
                int targetY = y + dy[i];

                if(targetX >=0 && targetY>=0 && targetY<N && targetX<M) {
                    if(maze[targetY][targetX] == 1 && !visited[targetY][targetX]) {
                        visited[targetY][targetX] = true;
                        //cnt++;
                        queue.add(new Pair2(targetX, targetY));
                        maze[targetY][targetX] = maze[y][x] +1;
                    }
                }
            }

        }

        System.out.println(maze[N-1][M-1]);

    }
}

class Pair2 {
    int x;
    int y;

    Pair2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

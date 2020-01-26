package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cabbage_1012 {

    static int[][] map;
    static boolean[][] visited;
    static int m,n,k;
    static Queue<Pair> queue = new LinkedList<>();
    static ArrayList al = new ArrayList<>();

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        m = Integer.parseInt(str[0]);
        n = Integer.parseInt(str[1]);
        k = Integer.parseInt(str[2]);

        map = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<k; i++) {
            String[] str2 = br.readLine().split(" ");
            int a = Integer.parseInt(str2[0]);
            int b = Integer.parseInt(str2[1]);

            map[b][a] = 1;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] != 1) {
                    map[i][j] = 0;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    bfs(j,i);
                }
            }
        }

        System.out.println(al.size());
    }

    static void bfs(int x, int y) {
        visited[y][x] = true;
        queue.add(new Pair(x,y));

        int cnt=1;
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            for(int k=0; k<4; k++) {
                int targetX = p.x + dx[k];
                int targetY = p.y + dy[k];

                if(targetX>=0 && targetY>=0 && targetY<n && targetX <m) {
                    if(map[targetY][targetX] == 1 && !visited[targetY][targetX]) {
                        queue.add(new Pair(targetX, targetY));
                        visited[targetY][targetX] = true;
                        cnt++;
                    }
                }
            }
        }

        al.add(cnt);
    }
}




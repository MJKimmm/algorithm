package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cabbage_1012 {

    public static int[][] map;
    public static boolean[][] visited;
    public static int m,n,k;
    public static Queue<Pair> queue = new LinkedList<>();
    public static ArrayList al = new ArrayList<>();

    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};


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

        int cnt=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    bfs(i,j);
                    queue.add(new Pair(j,i));
                }
            }
        }

        //System.out.println(al.size());
        System.out.println("aaaaaaaaaaaaaaa");
        System.out.println(cnt);

    }

    static void bfs(int i, int j) {
        //cnt=0;
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            int x = p.x;
            int y = p.y;

            for (int q = 0; q < 4; i++) {
                int targetX = x + dx[q];
                int targetY = y + dy[q];

                if(targetX >=0 && targetY>=0 && targetY<n && targetX<m) {
                    if(map[targetY][targetX] == 1 && !visited[targetY][targetX]) {
                        queue.add(new Pair(targetX, targetY));
                        visited[targetY][targetX] = true;
                        //cnt++;
                    }
                }
            }
        }

        //al.add(cnt);

    }

}



package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bfs_apartment2_2667 {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList al = new ArrayList<>();

    static Queue<Pair3> queue = new LinkedList<>();

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++) {
            String str = sc.next();
            for(int j=0; j<N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    bfs(i,j);
                }
            }
        }

        System.out.println(al.size());
        Collections.sort(al);
        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }



    }

    static void bfs(int i, int j) {
        queue.add(new Pair3(i,j));
        visited[i][j] = true;

        int house = 1;
        while(!queue.isEmpty()) {
            Pair3 p = queue.poll();
            int x = p.x;
            int y = p.y;

            for(int q=0; q<4; q++) {
                int targetX = x + dx[q];
                int targetY = y + dy[q];

                if(targetX<N && targetY<N && targetX >=0 && targetY >=0) {
                    if (map[targetX][targetY] ==1 && !visited[targetX][targetY]) {
                        queue.add(new Pair3(targetX, targetY));
                        visited[targetX][targetY] = true;
                        house++;
                    }
                }
            }
        }

        al.add(house);
    }

}

class Pair3 {
    int x;
    int y;

    Pair3(int x, int y) {
        this.x=x;
        this.y=y;

    }

}


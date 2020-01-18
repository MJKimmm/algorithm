package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class bfs_myapartment_2667 {
    public static int N, cnt;
    public static int[][] map;
    public static boolean[][] visited;

    public static PriorityQueue<Integer> pq;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        pq = new PriorityQueue<Integer>();

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {

                if(map[i][j] == 1 && !visited[i][j]) {
                    cnt = 0;
                    bfs(i,j);
                    pq.offer(cnt);
                }

            }
        }

        System.out.println(pq.size());

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }

    public static int bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[] {y,x});

        while(!queue.isEmpty()) {
            int targetY = queue.peek()[0];
            int targetX = queue.peek()[1];
            queue.poll();

            if (targetX >= 0 && targetY >= 0 && targetX < N && targetY < N) {
                if (map[targetY][targetX] == 1 && !visited[targetY][targetX]) {
                    visited[targetY][targetX] = true;
                    cnt++;

                    queue.offer(new int[]{targetY + 1, targetX});
                    queue.offer(new int[]{targetY - 1, targetX});
                    queue.offer(new int[]{targetY, targetX + 1});
                    queue.offer(new int[]{targetY, targetX - 1});

                }
            }
        }

        return cnt;
    }
}

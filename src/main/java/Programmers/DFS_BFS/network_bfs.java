package Programmers.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class network_bfs {

    public static void main(String[] args) {
        int n=3;
        int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};
        System.out.println(Solution3.solution(n, computers));
    }

}

class Solution3 {
    public static int solution(int n, int[][] computers) {
        Queue q = new LinkedList<>();
        int cnt = 0;
        boolean[] visited = new boolean[computers.length];
        for(int i=0; i<computers.length; i++) {
            if(!visited[i]) {
                q.offer(i);
                cnt++;
            }
            while(!q.isEmpty()) {
                int idx = (int)q.poll();
                visited[idx] = true;
                for(int k=0; k<n; k++) {
                    if(k==idx) continue;
                    if(computers[idx][k] ==1 && !visited[k]) q.offer(k);
                }
            }
        }

        return cnt;
    }
}
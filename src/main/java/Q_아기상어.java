import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q_아기상어 {

    static int N;
    static int map[][];
    static boolean visited[][];
    static int nowSize; // 현재 크기
    static int numSize; // 먹은 횟수
    static int dist; // 거리

    static Queue<Pair> queue = new LinkedList<>();

    static int[] dx = {-1,-1,1,0};
    static int[] dy = {0,0,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        nowSize=2;
        numSize = 0;
        dist=0;


        for(int i=0; i<N; i++) {
            String[] str = br.readLine().split(" ");
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j] && map[i][j] == 9) { //////////수정
                    map[i][j] = 0;
                    bfs(i,j);
                }
            }
        }

        System.out.println(dist);

    }

    static int bfs(int i, int j) {
        queue.add(new Pair(i, j));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int x = p.x;
            int y = p.y;

            for (int q = 0; q < 4; q++) {
                int targetX = x + dx[q];
                int targetY = y + dy[q];

                if (targetX >= 0 && targetY >= 0 && targetX < N && targetY < N) {
                    if (map[targetX][targetY] <= nowSize && !visited[targetX][targetY]) {
                        // 0일 때 움직임,  잡아먹기 X
                        queue.add(new Pair(targetX, targetY));
                        dist++;

                        // 잡아먹기
                        if (map[targetX][targetY] != 0 && map[targetX][targetY] < nowSize) {
                            numSize++;
                            map[targetX][targetY] = 0;
                            visited[targetX][targetY] = true;

                            if (numSize == nowSize) {
                                nowSize++;
                                numSize = 0;
                            }
                        }
                    }
                }
            }
        }

        return dist;
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

package DFS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class dfs_myapartment_2667 {

    static int N;
    static int cnt;
    static int map[][];
    static int visited[][];
    static ArrayList arr = new ArrayList();

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        map = new int[N][N];
        visited = new int[N][N];

        for(int i=0; i<N; i++) {
            String str = scanner.next();
            for(int j=0; j<N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] == 1 && visited[i][j] == 0) {
                    cnt=1;
                    dfs(i,j);
                    arr.add(cnt);
                }
            }
        }

        Collections.sort(arr);
        System.out.println(arr.size());

        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }

    static int dfs(int x, int y) {
        visited[x][y] = 1;

        for(int i=0; i<4; i++) {
                int targetX = x + dx[i];
                int targetY = y + dy[i];

                if(targetX >=0 && targetY>=0 && targetX<N && targetY<N) {
                    if(map[targetX][targetY] == 1 && visited[targetX][targetY] == 0) {
                        dfs(targetX, targetY);
                        cnt++;
                    }
            }
        }
        return cnt;

    }
}

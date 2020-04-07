package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q_1068 {

    static int N;
    static int[][] nodes;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        nodes=new int[N][2];
        for(int i=0; i<N; i++) {
            nodes[i][0] = sc.nextInt();
        }
        getChildNum();
        remove(sc.nextInt());
        System.out.println(getAnswer());

    }

    private static void getChildNum() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(nodes[j][0] == i) nodes[i][1]++; /////////////
            }
        }
    }

    private static void remove(int num) {
        if(nodes[num][0] != -1) { // 루트노드아니면
            nodes[nodes[num][0]][1]--;
        }
        nodes[num][0] = -2; // 지워진 노드 표시
        if(nodes[num][1]>0)  {
            // 자식이 있으면
            for(int i=0; i<N; i++) {
                if(nodes[i][0]==num) {
                    remove(i);
                }
            }
        }
    }

    private static int getAnswer() {
        int cnt = 0;
        for(int i=0; i<N; i++) {
            if(nodes[i][0] != -2 && nodes[i][1]==0) {
                cnt++;
            }
        }
        return cnt;
    }






}

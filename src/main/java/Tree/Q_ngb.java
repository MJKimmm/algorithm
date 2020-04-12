package Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_ngb {

    static int N;
    static int M;
    static int[][] nodes;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        nodes = new int[N][2];

        for(int i=0; i<N; i++) {
            nodes[i][0] = sc.nextInt();
        }

        getChildNum();

        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<M; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();

            al.add(findNum(p,q));
        }

        int sum=0;
        for(int i=0; i<al.size(); i++) {
            //sum += al.get(i);
            System.out.println(al.get(i));
        }
        System.out.println(sum);
    }

    private static void getChildNum() {
        for(int i=1; i<N+1; i++) {
            for (int j=0; j<N; j++) {
                if (nodes[j][0] == 0) nodes[i-1][1] = N-1;
                else if (nodes[j][0] == i) nodes[i-1][1]++;
                else nodes[i-1][1]=0;
            }
        }

        for(int i=0; i<N; i++) {
            System.out.println("n" + nodes[i][1]);
        }

    }

    private static int findNum(int p, int q) {
        int answer = nodes[p-1][1] - nodes[q-1][1];
        return answer;
    }


}

package DP;

public class Q_타일장식물 {

    public static void main(String[] args) {
        int N = 7;
        System.out.println(solution(N));
    }

    public static long solution(int N) {
        long[] fibo = new long[N];
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i=2; i<fibo.length; i++) {
            fibo[i] = fibo[i-2] + fibo[i-1];
        }

        return (fibo[N-2]+fibo[N-1]+fibo[N-1])*2;
    }

}

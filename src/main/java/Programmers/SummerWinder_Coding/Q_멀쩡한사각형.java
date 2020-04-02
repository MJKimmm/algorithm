package Programmers.SummerWinder_Coding;

public class Q_멀쩡한사각형 {
    public static void main(String[] args) {
        int W = 8;
        int H = 12;

        System.out.println(Solution.solution(W,H));
    }

}

class Solution {
    public static long solution(int w,int h) {

        int start_total = w*h;
        int total = 0;
        int subSquare = 0;
        int gcdNum = gcd(w,h);

        System.out.println(gcdNum);
        if(gcdNum == 1) {
            total = w+h-1;
        }

        else {
            total = start_total - (w+h-gcdNum); ///////////////
        }
        return total;
    }

    static int gcd(int a, int b) {
        if(a%b == 0)
            return b;
        return gcd(b, a%b);
    }
}
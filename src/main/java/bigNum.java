import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bigNum {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String str = sc.next();

        long max = 0;
        for (int i = 0; i < N - K + 1; i++) {
            //int num = Integer.parseInt(str.substring(i, i + K));
            long num = Long.parseLong(str.substring(i, i + K));
            if (max < num) {
                max = num;
            }
        }



        System.out.println(max);
    }
}
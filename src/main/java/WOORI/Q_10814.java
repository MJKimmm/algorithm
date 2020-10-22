package WOORI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str1 = new String[2];
        String[][] str = new String[N][2];

        for(int i=0; i<N; i++) {
            str1 = br.readLine().split(" ");
            str[i][0] = str1[0];
            str[i][1] = str1[1];
        }

        Arrays.sort(str, new Comparator<String[]>() { // 나이순, 가입순
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

                for(int i=0; i<str.length; i++) {
                    System.out.println(str[i][0] + " " + str[i][1]);
                }

    }
}

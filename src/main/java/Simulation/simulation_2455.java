package Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class simulation_2455 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int max=0;

        for(int i=0; i<4; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            cnt = cnt - a + b;

            if(cnt>max) {
                max = cnt;
            }
        }

        System.out.println(max);



    }
}

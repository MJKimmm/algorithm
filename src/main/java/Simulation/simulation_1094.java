package Simulation;

import java.util.LinkedList;
import java.util.Scanner;

public class simulation_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int len = 64;
        int stick = 0;
        int result = 0;
        int end = X;

        while(true) {
            if(X==64) {
                stick++;
                break;
            }

            len = len/2; // 작아질 때까지 계속 나누기 2

            if(X >= len) {
                result += len;
                stick++;
                if(end==result) {
                    break;
                }
                X = X-len;
            }
        }

        System.out.println(stick);


    }
}

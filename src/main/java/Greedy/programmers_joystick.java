package Greedy;

import java.util.Scanner;

public class programmers_joystick {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(Solution3.solution(str));
    }

}

class Solution3 {
    public static int solution(String name) {
        int answer = 0;

        // a-z : 97-122
        String name2 = name.toLowerCase();
        int[][] arr = new int[26][2];

        for(int i=0; i<26; i++) {
                arr[i][0] = i + 97;
                arr[i][1] = i;
        }


        for(int i=0; i<name2.length(); i++) {
            char ch = name2.charAt(i);
            int num = (int)ch;

            if (num < 110 && num!=97) {
                answer += arr[num-97][1];
            }

            else if(num == 97) {
                answer--;
            }

            else {
                answer += 26-arr[num-97][1];
            }
        }

        answer += name2.length()-1;



        return answer;
    }
}
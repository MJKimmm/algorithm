package Greedy;

import java.util.Arrays;

public class programmers_lifeboat {
}

class Solution2 {
    public int solution(int[] people, int limit) {
        int count = 0;
        int max = 0;
        int min = 240;

        int start = 0;
        int end = people.length;

        Arrays.sort(people);

        for(int i=start; i<end; i++) {
            if (people[i] >= max) {
                max = people[i];
            }
            if (people[i] < min) {
                min = people[i];
            }
        }

        int sum = max+min;
        if (sum <= limit) {
            count++;
            start++;
            end--;
        } else {
            count++;
            end--; // end 값 초기화되는 문제
        }


 /*       limit = limit - people[0];
        for(int i=1; i<people.length; i++) {
            if(people[i] <= limit) {
                limit = limit-people[i];
            }

            else
                count++;
        } */

        return count;
    }

}
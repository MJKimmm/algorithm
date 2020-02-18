package Greedy;

import java.util.Arrays;

public class programmers_lifeboat {
}

class Solution2 {
    public int solution(int[] people, int limit) {
        int count = 0;
        int start = 0;
        int end = people.length-1;

        Arrays.sort(people);

        for (int i = 0; i < people.length; i++) {
            if (start < end) {
                int min = people[start];
                int max = people[end];
                int sum = min + max;

                if (sum <= limit) {
                    count++;
                    start++;
                    end--;
                } else {
                    count++;
                    end--;
                }
            }

            else if(start==end) {
                count++;
                break;
            }

            else {
                break;
            }
        }

        return count;
    }

}
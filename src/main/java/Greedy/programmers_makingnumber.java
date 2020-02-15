package Greedy;

public class programmers_makingnumber {


}

class Solution1 {
    public String solution(String number, int k) {
        String answer = "";

        int[] arr = new int[answer.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = answer.charAt(i);
        }

        int answer_len = answer.length()-k; // 6
        int max = 0;

        int flag=0;
        for (int i = answer_len - 1; i < arr.length; i++) {
            for (int j = flag; j < answer_len - 1; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    flag = j + 1;
                }

            }
        }



        return answer;
    }
}
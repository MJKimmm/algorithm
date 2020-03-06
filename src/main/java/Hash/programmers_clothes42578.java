package Hash;

import java.util.HashMap;

public class programmers_clothes42578 {
}

class Solution2 {
    public int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String, String> hm = new HashMap<String, String>();

        int n = clothes.length;
/*
        for(int i=0; i<n; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) +1);
        }

        answer += n;

        for(String a: hm.keySet()) {
            System.out.println(hm.get(a));
            System.out.println(hm.get(a));
        } */

        for(int i=0; i<n; i++) {
            hm.put(clothes[i][0], clothes[i][1]); // key : 옷이름 value : 옷종류
            answer++;
        }

        System.out.println(answer);

        int m=0;
        for(String a:hm.keySet()) {
            for(String b:hm.keySet()) {
              /*  if(hm.get(a) != hm.get(b) && a!=b) {
                    System.out.println(a + b);

                } */

                if(!hm.get(a).equals(hm.get(b)) && a!=b) {
                    System.out.println(a + b);
                    m++;

                }

            }
        }
        answer += m/2;

        return answer;
    }
}
package WOORI;

import java.util.HashMap;

public class Q_위장 {

    class Solution {
        public int solution(String[][] clothes) {
            int answer = 0;

            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for(int i=0; i<clothes.length; i++) {
                map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
            }

            int sum=1;
            for (String key: map.keySet()){
                //System.out.println(map.get(key));
                sum *= (map.get(key)+1); // eyewear 3가지 종류 + 안입는경우 1
            }

            return sum-1; // 모두 안입는경우 1 빼기
        }
    }


}

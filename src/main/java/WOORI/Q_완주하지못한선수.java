package WOORI;

import java.util.HashMap;

public class Q_완주하지못한선수 {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            HashMap<String, Integer> map = new HashMap<String, Integer>();
            for(String a:participant) map.put(a, map.getOrDefault(a,0)+1);
            for(String a:completion) map.put(a, map.get(a)-1);
            for(String compare:map.keySet()) {
                if(map.get(compare)!=0) {
                    answer += compare;
                }
            }

            return answer;
        }
    }
}

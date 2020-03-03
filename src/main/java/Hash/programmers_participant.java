package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class programmers_participant {

}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        /* hash 사용 x
        for(int i=0; i<participant.length; i++) {
            Boolean flag = true;
            for(int j=0; j<completion.length; j++) {
                if(participant[i].equals(completion[j])) {
                    flag = false;
                    completion[j] = null;
                }
            }
            if(flag) {
                answer += participant[i];
            }
        }
         */

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String a:participant) map.put(a, map.getOrDefault(a, 0) +1);
        for(String a:completion) map.put(a, map.get(a)-1);
        for(String compare:map.keySet()) {
            if(map.get(compare) != 0) {
                answer += compare;
            }
        }


        return answer;
    }
}
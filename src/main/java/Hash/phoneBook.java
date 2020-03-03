package Hash;

import java.util.*;

public class phoneBook {

}

class Solution1 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        /* hash 사용 x, 시간 초과
        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for (int i = 0; i < phone_book.length; i++) {
            int num = phone_book[i].length();
            for(int j=i+1; j< phone_book.length; j++) {
                if (phone_book[i].equals(phone_book[j].substring(0,num))) {
                    answer = false;
                }
            }

        } */

        /* 시간초과2
        for(int i=0; i<phone_book.length; i++) {
            for(int j=0; j<phone_book.length; j++) {
                if(i!=j && phone_book[j].startsWith(phone_book[i])) {
                    answer = false;
                }
            }
        }
         */

        /* 시간 초과 x
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[j].startsWith(phone_book[i])) {
                    answer = false;
                }
            }
        }

         */

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<phone_book.length; i++) {
            for(int j=1; j<phone_book[i].length(); j++) {
                map.put(phone_book[i].substring(0,j), 1);
            }
        }

        for (int i = 0; i < phone_book.length; i++) {
            if (map.containsKey(phone_book[i])) {
                answer = false;
            }
        }

        return answer;
    }
}
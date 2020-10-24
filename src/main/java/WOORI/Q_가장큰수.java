package WOORI;

import java.util.Arrays;
import java.util.Comparator;

public class Q_가장큰수 {

    public static String solution(int[] numbers) {
        String answer = new String();
        String str_numbers[] = new String[numbers.length];

        for(int i=0; i<numbers.length; i++) {
            str_numbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str_numbers, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2); //A.compareTo(B)는 A가 B보다 크면 양수, 작으면 음수
            }
        });

        if(str_numbers[0].startsWith("0")) {
            answer+= "0";
        } else {
            for(int j=0; j<str_numbers.length; j++) {
                answer += str_numbers[j];
            }
        }

        return answer;
    }

}

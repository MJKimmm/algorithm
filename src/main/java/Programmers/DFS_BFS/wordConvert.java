package Programmers.DFS_BFS;

public class wordConvert {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(Solution1.solution(begin, target, words));
    }

}

class Solution1 {
    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        //char[] beginArr = begin.toCharArray();
        //char[] targetArr = target.toCharArray();

        String flag = begin;
        for(int i=0; i<words.length; i++) {
            for (int p = 0; p < flag.length(); p++) {
                for (int q = 0; q < words[i].length(); q++) {
                    if (flag == target) {
                        System.out.println("a" + flag);
                        answer++;
                        return answer;
                    } else if (flag.charAt(p) == words[i].charAt(q)) {
                        System.out.println(flag);
                        flag = words[i];
                        answer++;
                        i++;
                        //break;
                    }

                }
            }
        }

        return answer;
    }
}
package Hash;


import java.util.*;

public class bestAlbum {

    public static void main(String[] args) throws Exception {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        for (int a : Solution3.solution(genres, plays)){
            System.out.print(a);
        }
    }
}

class Solution3 {
    public static int[] solution(String[] genres, int[] plays) {


        HashMap<String, Integer> songSum = new HashMap<String, Integer>();

        for(int i=0; i<genres.length; i++) {
            songSum.put(genres[i], songSum.getOrDefault(genres[i],0) + plays[i]);
        }

        HashMap<Integer, Integer> playNum = new HashMap<Integer, Integer>();

        for(int i=0; i<genres.length; i++) {
            playNum.put(i, plays[i]);
        }

        LinkedList<String> songKinds = new LinkedList<>();
        songKinds.addAll(songSum.keySet());
        Collections.sort(songKinds, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return songSum.get(o2)-songSum.get(o1);
            }
        });

        for (String key : songKinds){
            System.out.println(key);
        }

        ArrayList<Integer> songNum = new ArrayList<Integer>();
        songNum.addAll(playNum.keySet());
        Collections.sort(songNum, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = playNum.get(o1);
                int b = playNum.get(o2);

                if(a==b) {
                    return o1-o2;
                }

                return b-a;
            }
        });

        for(int a : songNum){
            System.out.println(a);

        }

        ArrayList<Integer> result = new ArrayList<>();
        for(String a : songKinds) {
            int count=0;
            for(Integer b : songNum) {
                if(genres[b].equals(a)) {

                    if(count<=1) {
                        result.add(b);
                        count++;
                    }

                    else {
                        break;
                    }
                }
            }

        }

        int[] answer = new int[result.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

}

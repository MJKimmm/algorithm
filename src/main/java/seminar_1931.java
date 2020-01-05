import java.util.*;

public class seminar_1931 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            arr[i][0] = a;
            arr[i][1] = b;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                for(int i=0; i<N; i++) {
                    if(arr[i][1] > arr[i+1][1]) {
                        return Integer.compare(o1[0], o2[0]); //////////////
                    }
                }
                return Integer.compare(o1[0], o2[0]);

            }
        });

    }
}

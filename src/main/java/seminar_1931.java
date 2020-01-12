import java.util.*;

public class seminar_1931 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][2];

        /*
        for(int i=0; i<N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            arr[i][0] = a;
            arr[i][1] = b;
        } */

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


        // [i][1] 행 기준으로 먼저 한번 정렬
        // 앞의 수가 비교값보다 작으면 -1 같으면 0 앞의 수가 비교값보다 클 경우 1 반환
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int cnt = 1;
        int end = arr[0][1];
        for(int i=0; i<N-1; i++) {

            if (end < arr[i+1][0] || end == arr[i+1][0]) {
                cnt++;
                end = arr[i+1][1];
            }
        }

        System.out.println("cnt : " + cnt);

    }
}

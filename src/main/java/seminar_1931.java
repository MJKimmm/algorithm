import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        for(int i=0; i<N; i++) {
            for(int k=0; k<N; k++) {
                //arr[i][1] - arr[i][0]
            }
        }



    }
}

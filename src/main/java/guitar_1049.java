import java.util.Scanner;

public class guitar_1049 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[M][2];

        int money = 0;
        int min = 1000;

        for(int i=0; i<M; i++) {

            for (int k = 0; k < 2; k++) {

                int a = scanner.nextInt();
                arr[i][k] = a;

            }
        }

        while (N >= 6) {
            for(int i=0; i<M; i++) {
                if(arr[i][0] < min) {
                    min = arr[i][0];
                }
            }
            System.out.println("min : " + min);

            money += min;
            N -= 6;

            if(N < 6)
                break;
        }


        for(int i=0; i<M; i++) {
            if(arr[i][1] < min) {
                min = arr[i][1];
            }
        }

        System.out.println("min : " + min);

        money += min*N;

        System.out.println("money : " + money);

    }
}

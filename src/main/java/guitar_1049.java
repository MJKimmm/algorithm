import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class guitar_1049 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        Scanner scanner = new Scanner(System.in);

        //int N = scanner.nextInt();
        //int M = scanner.nextInt();
        int[][] arr = new int[M][2];

        int money = 0;
        int min1 = 1000;
        int min2 = 1000;

        for(int i=0; i<M; i++) {
            for (int k = 0; k < 2; k++) {
                int a = scanner.nextInt();
                arr[i][k] = a;
            }
        }

        // Math.min
     /*   for(int i=0; i<M; i++) {
            if(arr[i][0] < min1) {
                min1 = arr[i][0];
            }
        }

        for(int i=0; i<M; i++) {
            if(arr[i][1] < min2) {
                min2 = arr[i][1];
            }
        } */

     for(int i=0; i<M; i++) {
         String[] input = bufferedReader.readLine().split(" ");
         min1 = Math.min(min1, Integer.parseInt(input[0]));
         min2 = Math.min(min2, Integer.parseInt(input[1]));

     }

        System.out.println("min1 : " + min1);
        System.out.println("min2 : " + min2);

        int count1 = N / 6;
        int count2 = N % 6;

        // (min1* (count1+1)) // min1*count1 + min2*count2 // min2*N

        int[] sumMoney = new int[3];
        sumMoney[0] = min1* (count1+1);
        sumMoney[1] = min1*count1 + min2*count2;
        sumMoney[2] = min2*N;

        int min = sumMoney[0];

        for(int i=1; i<3; i++) {
            if(sumMoney[i] < min) {
                min = sumMoney[i];
            }
        }

        System.out.println("min : " + min);

    }
}

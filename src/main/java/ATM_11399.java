import java.util.Arrays;
import java.util.Scanner;

public class ATM_11399 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] line = new int[n];
        int[] time = new int[n];
        int total = 0;

        for(int i=0; i<n; i++) {
            line[i] = scanner.nextInt();
        }

        Arrays.sort(line);

        total = line[0];
        for(int i=1; i<n; i++) {
            line[i] += line[i-1];
            total = total + line[i];
        }
/*
        for(int i=0; i<n; i++) {
            if(i == 0) {
                time[i] = line[i];
            }

            else {
                time[i] = time[i - 1] + line[i];
            }

            System.out.println(time[i]);
        }



        for (int i=0; i<n; i++) {
            total += time[i];
        } */

        System.out.println("total : " + total);
    }

}

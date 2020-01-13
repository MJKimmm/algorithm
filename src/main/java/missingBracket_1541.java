import java.util.Arrays;
import java.util.Scanner;

public class missingBracket_1541 {
    static String[] str1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        str1 = scanner.nextLine().split("-");

        System.out.println(Arrays.toString(str1));

        int sum = 0;
        for(int i=0; i<str1.length; i++) {
            if(i==0) {
                sum += getSum(str1[i]);
            }

            else {
                sum -= getSum(str1[i]);
            }

            System.out.println(sum);
        }

    }

    static int getSum(String str) {
        int num1 = 0;
        String[] str2 = str.split("\\+");

        for(int j=0; j<str2.length; j++) {
            num1 += Integer.parseInt(str2[j]);
        }
        return num1;
    }

}

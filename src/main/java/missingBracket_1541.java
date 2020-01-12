import java.util.Arrays;
import java.util.Scanner;

public class missingBracket_1541 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] str1 = scanner.nextLine().split(" ");

        System.out.println(Arrays.toString(str1));

        int num1 = 0;
        int sum = 0;

        for(int i=0; i<str1.length; i++) {

            if((str1[i].charAt(0) != '+')  && (str1[i].charAt(0) != '-')) {
                sum += Integer.parseInt(str1[i]);
            }

            if(str1[i].charAt(0) == '-') {
               for(int j=i+1; j <= str1.length-i; j+=2) {
                    num1 += Integer.parseInt(str1[j]);

                    if(str1[j].charAt(0) == '-')
                        break;
                }
                System.out.println(num1);
            }

        }

        sum += num1;
        System.out.println(sum);

    }

}

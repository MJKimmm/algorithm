package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class bracket_9012 {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            //YesNo(str);

            if(YesNo(str) == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }

    static boolean YesNo(String str) {
        boolean flag = true;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(') {
                stack.push(i);
            }
            else {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    flag = false;
                }

            }
        }

        if(flag == false)
            return false;

        else if (flag == true && !stack.isEmpty())
            return false;

        else
            return true;
    }
}

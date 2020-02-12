package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class bracket_9012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<num; i++) {
            String str = sc.next();

            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);

                if(ch == '(')
                    stack.push(j);

                else {
                    if (str.charAt(j-1) == '(') {
                        stack.pop();
                    } else {
                        if (stack.isEmpty() != true)
                            stack.pop();
                        else
                            break;
                    }
                }

                if(j == str.length()-1) {
                    if(stack.isEmpty() == true) {
                        //System.out.println("YES");
                        arr.add("YES");
                    }

                    else
                        //System.out.println("NO");
                        arr.add("NO");
                }
            }
        }

        for(int k=0; k<arr.size(); k++) {
            System.out.println(arr.get(k));
        }
    }
}

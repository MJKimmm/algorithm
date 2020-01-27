package Stack;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class stack_10828 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String order;
        int data = 0;
        int buffer;
        boolean buffer2;

        for(int i=0; i<num; i++) {
            order = sc.next();

            switch(order) {
                case "push" :
                    data = sc.nextInt();
                    stack.push(data);
                    break;

                case "pop" :
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;

                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "top" :
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
            }
        }
    }

}

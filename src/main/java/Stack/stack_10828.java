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
                    continue;

                case "pop" :
                    try {
                        buffer = stack.pop();
                    } catch(EmptyStackException e) {
                        buffer = -1;
                    }
                    System.out.println(buffer);
                    continue;

                case "size" :
                    System.out.println(stack.size());
                    continue;
                case "empty" :
                    buffer2 = stack.empty();
                    if(buffer2 == false) buffer = 0; else buffer = 1; // 비지않았으면 buffer=0
                    System.out.println(buffer);
                    continue;
                case "top" :
                    try {
                        buffer = stack.peek();
                    } catch(EmptyStackException e) {
                        buffer = -1;
                    }
                    System.out.println(buffer);
                    continue;
            }
        }
    }

}

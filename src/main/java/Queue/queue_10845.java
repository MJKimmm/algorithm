package Queue;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue_10845 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String order;
        int q;
        boolean q2;

        for(int i=0; i<num; i++) {
            order = sc.next();
            switch(order) {
                case "push" :
                    int num2 = sc.nextInt();
                    queue.add(num2);
                    break;

                case "pop" :
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.poll());
                    break;

                case "size" :
                    System.out.println(queue.size());
                    break;

                case "empty" :
                    if(queue.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;

                case "front" :
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.peek());
                    break;

                case "back" :
                    int size = queue.size();
                    if(queue.isEmpty()) System.out.println(-1);
                    else {
                        while(size-- >1) {
                            queue.add(queue.poll());
                        }
                        System.out.println(queue.peek());
                        queue.add(queue.poll());
                    }
                    break;
            }
        }

    }
}

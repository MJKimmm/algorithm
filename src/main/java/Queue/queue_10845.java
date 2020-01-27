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
                    continue;

                case "pop" :
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.poll());
                    continue;

                case "size" :
                    System.out.println(queue.size());
                    continue;

                case "empty" :
                    q2 = queue.isEmpty();
                    if(q2 == true) q=1; else q=0;
                    System.out.println(q);
                    continue;

                case "front" :
                    if(queue.isEmpty()) System.out.println(-1);
                    else System.out.println(queue.peek());
                    continue;

                case "back" :
                    int size = queue.size();
                    try {
                        while(size-- >1) {
                            queue.poll();
                        }
                    } catch(EmptyStackException e) {
                        System.out.println(-1);
                    }
                    continue;
            }
        }

    }
}

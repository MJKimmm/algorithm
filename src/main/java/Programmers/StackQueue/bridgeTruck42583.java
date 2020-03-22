package Programmers.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class bridgeTruck42583 {

    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

        System.out.println(Solution6.solution(bridge_length, weight, truck_weights));
    }
}

class Solution6 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Integer> ingTruck = new LinkedList<>();
        Queue<Integer> waitTruck = new LinkedList<>();

        for(int i=0; i<truck_weights.length; i++) {
            waitTruck.add(truck_weights[i]);
        }

        int total = 0;
        int time = 0;
        int length = 0;

        total += waitTruck.peek(); /////////////
        ingTruck.add(waitTruck.poll());

        while(!ingTruck.isEmpty()) {
            time++;
            for(int i=0; i<ingTruck.size(); i++) {
                length++;
            }
            //System.out.println("time" + time + "len" + length);

            if(length>bridge_length) {
                total -= ingTruck.poll();
                if(ingTruck.isEmpty()) {
                    length=0;
                }
            }

            if(!waitTruck.isEmpty() && waitTruck.peek()+total <= weight) {
                total += waitTruck.peek();
                length++;
                ingTruck.add(waitTruck.poll());
            }
        }


        return time;
    }
}
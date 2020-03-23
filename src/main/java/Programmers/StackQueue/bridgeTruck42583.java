package Programmers.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class bridgeTruck42583 {

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(Solution6.solution(bridge_length, weight, truck_weights));
    }
}

class Solution6 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;

        Queue<Truck> waitTruck = new LinkedList<>();
        Queue<Truck> ingTruck = new LinkedList<>();

        for(int w : truck_weights) {
            waitTruck.add(new Truck(w, 0));
        }

        int total = 0;
        total += waitTruck.peek().weight;
        ingTruck.add(waitTruck.poll());

        while(!ingTruck.isEmpty()) {
            time++;

            for(Truck t : ingTruck) {
                t.distance++;
            }

            if(ingTruck.peek().distance > bridge_length) {
                total -= ingTruck.poll().weight;
            }

            if(!waitTruck.isEmpty() && total+waitTruck.peek().weight <= weight) {
                total += waitTruck.peek().weight;
                waitTruck.peek().distance++;
                ingTruck.add(waitTruck.poll());
            }
        }

        return time;
    }
}

class Truck {
    int weight;
    int distance;

    public Truck(int weight, int distance) {
        this.weight=weight;
        this.distance=distance;
    }
}
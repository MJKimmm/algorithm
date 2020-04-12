package Tree;

import java.util.Scanner;

public class Q_5639 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node2 node = new Node2(N);
        while(sc.hasNext()) {
            N = sc.nextInt();
            node = nodeInsert(node, N);
        }

    }

    public static Node2 nodeInsert(Node2 node, int N) {

    }
}

class Node2 {
    Node2 rightNode;
    Node2 leftNode;
    int value;

    public Node2(int value) {
        this.value = value;
    }
}


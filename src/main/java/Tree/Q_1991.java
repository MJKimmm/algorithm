package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q_1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Tree t = new Tree();
        char data[];
        for(int i=0; i<N; i++) {
            data = br.readLine().replaceAll(" ", "").toCharArray();
            t.add(data[0], data[1], data[2]);
        }
        t.preorder(t.root);
        System.out.println();
        t.inorder(t.root);
        System.out.println();
        t.postorder(t.root);
    }
}

class Node {
    char data;
    Node left, right;
    public Node(char data) {this.data = data;}
}

class Tree {
    Node root;
    public void add(char data, char leftData, char rightData) {
        if(root==null) {
            if(data!='.') root = new Node(data);
            if(leftData!='.') root.left = new Node(leftData);
            if(rightData!='.') root.right = new Node(rightData);
        }
        else search(root, data, leftData, rightData);
    }

    public void search(Node root, char data, char leftData, char rightData) {
        //도착한 노드가 null 이면 종료(삽입 위치를 찾지 못한 경우
        if(root==null) return;
        else if(root.data==data) {
            if(leftData!='.') root.left = new Node(leftData);
            if(rightData!='.') root.right = new Node(rightData);
        }
        //아직 찾지 못했고, 탐색할 노드들이 남아있는 경우
        else {
            search(root.left, data, leftData, rightData); // 왼쪽 재귀 탐색
            search(root.right, data, leftData, rightData); //오른쪽 재귀 탐색
        }

    }

    public void preorder(Node root) {
        System.out.println(root.data);
        if(root.left!=null) preorder(root.left);
        if(root.right!=null) preorder(root.right);
    }

    public void inorder(Node root) {
        if(root.left!=null) inorder(root.left);
        System.out.println(root.data);
        if(root.right!=null) inorder(root.right);
    }

    public void postorder(Node root) {
        if(root.left!=null) postorder(root.left);
        if(root.right!=null) postorder(root.right);
        System.out.println(root.data);
    }

}
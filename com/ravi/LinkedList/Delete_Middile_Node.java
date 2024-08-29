package com.ravi.LinkedList;

public class Delete_Middile_Node {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            data = this.data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(24);
        Node c = new Node(8);
        Node d = new Node(5);
        Node e = new Node(7);
        Node f = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
    }
}

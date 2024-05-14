package com.ravi.LinkedList;

public class BasicCreation {
    public static class  Node{
        int data; // Value
        Node next; // Address of next node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4); // head node with data 4
        System.out.println(a.next); // null value cause no Node connected

        Node b = new Node(7);
        Node c = new Node(10);

        // Linking the nodes
         a.next = b;
         b.next = c;

        System.out.println(a.next); // address of b node

    }
}

package com.ravi.LinkedList;

public class FindNth_Node {
    // Q - Finding nth Node from the end of the linked list (Only head is given) ?
    public static class Node{
        int data ;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int findNthNode(Node head, int nth){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=nth;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.println("original LinkedList :");
        display(a);
        System.out.println("Nth Node from the end of linked list :" +findNthNode(a,4));

    }
}

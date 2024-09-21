package com.ravi.LinkedList;

public class RemoveNthNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void removeNode(Node head, int nth){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=nth;i++){
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(11);
        Node f = new Node(13);
        Node g = new Node(15);

         a.next = b;
         b.next = c;
         c.next = d;
         d.next = e;
         e.next = f;
         f.next = g;
         g.next = null;

        System.out.println("Original Linked List :");
         display(a);
         removeNode(a,5);
        System.out.println("After removal of Nth Node: ");
        display(a);
    }
}


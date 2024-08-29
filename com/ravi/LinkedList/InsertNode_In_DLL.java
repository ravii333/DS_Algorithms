package com.ravi.LinkedList;

public class InsertNode_In_DLL {
    public static class Node{
        Node next;
        Node prev;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(11);
        Node c = new Node(17);
        Node d = new Node(21);

        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = null;
        d.prev = c;

        System.out.println("original Doubly LinkedList:");
      display(a);
      a = insertAtHead(a,99);
        System.out.println("After inserting new head:");
      display(a);
    }
}

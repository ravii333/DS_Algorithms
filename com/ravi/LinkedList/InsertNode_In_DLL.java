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
    public static void insertAtTail(Node head, int x){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAtIndex(Node head, int idx,int x){
        Node s = head;
        for(int i=1;i<=idx-1;i++){
            s = s.next;
        }
        // s is at index idx-1 position
        Node r = s.next;
        Node t = new Node(x);
        //STR
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
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
      //a = insertAtHead(a,99);
       // System.out.println("After inserting new head:");
     // display(a);
        //System.out.println("After adding a Node to Tail:");
      //insertAtTail(a,14);
      //display(a);

        insertAtIndex(a,2,40);
        System.out.println("After adding a Node to index :");
        display(a);
    }
}

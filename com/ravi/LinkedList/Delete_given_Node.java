package com.ravi.LinkedList;

public class Delete_given_Node {
    // Question - Can we delete a node given the node itself as parameter
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void deleteNode(Node head, int value){
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.data == value){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.println("Original linked list : ");
        display(a);

        deleteNode(a,8);
        System.out.println("After deletion of Node LL is:");
        display(a);

    }
}

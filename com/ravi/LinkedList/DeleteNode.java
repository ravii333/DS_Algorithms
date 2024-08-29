package com.ravi.LinkedList;

public class DeleteNode {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.println(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(12);
        ll.insertAtEnd(14);
        ll.insertAtEnd(9);

        ll.display();
    }
}

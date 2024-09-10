package com.ravi.LinkedList;

public class Deletion_inDLL {
  public static class Node{
      Node next ;
      Node prev ;
      int val;
      Node(int val){
          this.val = val;
      }
    }
    public static void display(Node head){
      Node temp = head;
      while(temp!=null){
          System.out.print(temp.val+ " ");
          temp = temp.next;
      }
        System.out.println();
    }
    public static void deleteTail(Node head){
      Node temp = head;
      while(temp.next!=null){
          temp = temp.next;
      }
      temp = temp.prev;
      temp.next = null;
    }
    public static Node deleteHead(Node head){
      head = head.next;
      head.prev = null;
      return head;
    }
    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(12);
        Node c = new Node(13);
        Node d = new Node(14);
        Node e = new Node(15);

        a.next = b;
        a.prev = null;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.next = e;
        d.prev = c;
        e.prev = d;
        e.next = null;

        System.out.println("Original Doubly LinkedList :");
        display(a);
//        System.out.println("Doubly LinkedList After Deleting head :");
//       Node newHead = deleteHead(a);
//        display(newHead);
        System.out.println("After deleting tail of Doubly Linked List :");
        deleteTail(a);
        display(a);
    }
}

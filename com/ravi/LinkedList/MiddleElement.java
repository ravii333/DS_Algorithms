package com.ravi.LinkedList;

import java.util.List;

public class MiddleElement {
    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this .data = data;
        }
    }
    public static ListNode middleElement(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(1);
        ListNode f = new ListNode(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        System.out.println(middleElement(a));
    }
}

import java.util.*;

import org.w3c.dom.Node;

public class linkedlistZigZag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void zigZag() {
        if (head == null || head.next == null) {
            return; // No need to zigzag if the list is empty or has only one element
        }

        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR; // for zig zag merge
        // alternating merge
        while (left != null && right != null) {
            // 4 steps for zig-zag
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            // 2 steps for updation
            left = nextL;
            right = nextR;
        }
    }

    // Helper method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlistZigZag ll = new linkedlistZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        System.out.print("Original List: ");
        ll.printList();
        ll.zigZag();
        System.out.print("ZigZag List: ");
        ll.printList();
    }

}
// step1: findMid
// step2: reverse
// step3: alternateMerging
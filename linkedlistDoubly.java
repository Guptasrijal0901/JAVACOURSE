import java.util.*;

import org.w3c.dom.Node;

public class linkedlistDoubly {
    public class Node {
        int data;
        Node next;
        Node prev;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove - removeLast
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void reverseDll() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            // Swap next and prev pointers
            curr.next = prev;
            curr.prev = next;

            // Move prev and curr one step forward

            prev = curr;
            curr = next;
        }
        // After the loop, prev will be the new head
        head = prev;
    }

    public static void main(String[] args) {
        linkedlistDoubly dll = new linkedlistDoubly();
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // System.out.println(dll.size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);
        dll.reverseDll();
        dll.print();
    }
}
// A doubly linked list in Java is a data structure where each element (called a
// node) contains three parts:

// 1. Data: The actual value stored in the node.
// 2. Next Pointer: A reference (or pointer) to the next node in the list.
// 3. Previous Pointer: A reference (or pointer) to the previous node in the
// list.

// - Doubly means that each node points to both the next node and the previous
// node, unlike a singly linked list which only points to the next node.
// - The first node (also called the head) has its previous pointer set to
// `null` because there is no node before it.
// - The last node (also called the tail) has its next pointer set to `null`
// because there is no node after it.

// Key Points:
// - You can traverse the list in both directions (forward and backward).
// - The extra `prev` pointer helps in efficient operations like insertions and
// deletions in the middle of the list.
// - This structure is useful when you need to frequently move in both
// directions within the list.
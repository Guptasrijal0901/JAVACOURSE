public class queueFromLinkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

    }

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    public static void main(String[] args) {

    }
}
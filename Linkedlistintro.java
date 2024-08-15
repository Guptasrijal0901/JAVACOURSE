public class Linkedlistintro {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // methods to
    // add
    // remove
    // print
    // search
    public static void main(String[] args) {
        Linkedlistintro ll = new Linkedlistintro();
        ll.head = new Node(1);
        ll.head.next = new Node(2);

    }
}
// it is class of nodes which have object
//
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
    // add: we can add at first or last

    public void addFirst(int data) {
        // -create new node
        // empty ll
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // -new node ko head banana
        newNode.next = head; // linking step
        // -head = new node
        head = newNode;
    }

    // remove
    // print
    // search
    public static void main(String[] args) {
        Linkedlistintro ll = new Linkedlistintro();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
// it is class of nodes which have object
// TC: O(1)
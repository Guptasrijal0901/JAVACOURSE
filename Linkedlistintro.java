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
        // empty linkedlist
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
    // -create new node
    // -tail.next = newNode
    // -tail = newNode
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print
    public void print() { // TC: O(n)
        if (head == null) {
            System.out.println("LL is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in middle
    public void addInmiddle(int idx, int data) {
        if (idx == 0) { // jab first mai add karna ho
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // search
    public static void main(String[] args) {
        Linkedlistintro ll = new Linkedlistintro();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addInmiddle(2, 9);
        ll.print();
    }
}
// it is class of nodes which have object
// TC: O(1) of both addlast and addfirst
// TC: O(1) of add node in the middle
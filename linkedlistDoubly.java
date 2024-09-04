public class linkedlistDoubly {
    public class Node(
        int data;
        Node next;
        Node prev;
// constructor
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    )
    public static Node;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            
        }
    }
    // remove
    //

    public static void main(String[] args) {
        
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
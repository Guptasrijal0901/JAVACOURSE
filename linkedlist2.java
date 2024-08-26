import org.w3c.dom.Node;

public class linkedlist2 {
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
    public static int size;

    public static boolean isCycle() { // Floyd's Cycle-Finding Algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle doesn't exist
    }

    // remove a loop/cycle in a linkedlist
    // detect cycle
    // slow ko head bana do
    // slow +1 and fast +1
    // null banana
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle = false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1-> 2 -> 3 -> 2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
// Floyd's Cycle-Finding Algorithm, often called the "Tortoise and Hare"
// algorithm,
// is a technique used to detect cycles in a sequence, most commonly in a
// linkedlist.

// Concept:
// - **Cycle**: In a linked list, a cycle occurs when a node's pointer links
// back to a previous node, forming a loop in the list.

// How the Algorithm Works:
// - The algorithm uses two pointers:
// - **Tortoise**: This pointer moves one step at a time.
// - **Hare**: This pointer moves two steps at a time.

// Key Steps:
// 1. **Initialization**: Both pointers start at the beginning of the linked

// list.
// 2. **Movement**: The Tortoise moves slowly, advancing one node per step,
// while the Hare moves faster, advancing two nodes per step.
// 3. **Cycle Detection**:
// - If the list has no cycle, the Hare will eventually reach the end of the
// list (a `null` reference).
// - If the list contains a cycle, the Hare,
// moving faster, will eventually catch up to the Tortoise within the cycle.

// Conclusion:
// - If the Tortoise and Hare meet, it confirms that there is a cycle in the
// list.
// - If the Hare reaches the end without meeting the Tortoise, the list is
// cycle-free.

// This approach efficiently detects cycles using only two pointers,
// making it both time and space efficient.
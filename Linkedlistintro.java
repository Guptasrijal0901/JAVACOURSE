import org.w3c.dom.Node;

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
    public static int size;

    // methods to
    // add: we can add at first or last

    public void addFirst(int data) {
        // -create new node
        // empty l inkedlist
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // -new node ko head banana
        newNode.next = head; // linking step
        // jo new node banaye hai usse head ka next bana do
        // -head = new node
        head = newNode;
        // aab new node ko head bana do
    }

    // remove
    // -create new node
    // -tail.next = newNode
    // -tail = newNode
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
        size++;
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

    // remove first
    public int removeFirst() {
        // when their is no values present in LL
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
            // when head and tail is same
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
        // size--;
        // garbage collector take the useless node
    }

    // remove lastLast()
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty.");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev: i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // search (iterative)
    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // search (recursive)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int searchRec(int key) {
        return helper(head, key);
    }

    // reverse linkedlist
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // find and remove nth node from end
    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head; // uses a temporary node (temp) to traverse the list.
        while (temp != null) { // The while loop iterates through the list until temp becomes null (end of the
                               // list), incrementing sz on each step.
            temp = temp.next;
            sz++;
        }
        // corner case jab head ko hi delete karna hai
        if (n == sz) { // If n is equal to sz, it means you want to delete the first node (the head)
                       // from the list.
            head = head.next;
            // n this case, the code simply sets head to head.next, effectively removing the
            // first node from the list and returning immediately.
            // Node prev (starting from head):
            // prev is a variable of type Node that starts at the head of the linked list.
            // head is the first node in the linked list, so prev initially points to this
            // first node.
            return;
        }
        // sz-n tk jana
        // If the node to delete is not the head, the code calculates the position of
        // the node that comes just before the one we want to delete (iToFind = sz - n).
        int i = 0;
        int iToFind = sz - n;
        // It initializes i to 0 and uses a node prev (starting from head) to traverse
        // the list up to the iToFind position.
        Node prev = head;
        // Once the while loop completes, prev is positioned at the node just before the
        // one that needs to be deleted.
        // The code then changes the next pointer of prev to skip over the node to be
        // deleted, effectively removing it from the list.
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        // Finally, the method returns, and the linked list now has one fewer node
        prev.next = prev.next.next;
        return;
    }

    // check if ll is a palindrome
    // 1. find mid
    // slow-fast rule
    // slow = head se start hota hai-> +1 -> mid tk puchege
    // fast = head se start hota hai-> +2 -> jb null tk puchega
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && slow != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my middleNode
    }

    // 2nd half ko reverse karna hai
    public boolean checkPalindrome() {
        // base case
        if (head == null || head.next != null) {
            return true;
        }
        // step1- find mid
        Node midNode = findMid(head);
        // step2- reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // step3- check left half nad right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void zigZag() {
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

    public static void main(String[] args) {
        Linkedlistintro ll = new Linkedlistintro();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.print();
        // ll.addInmiddle(2, 3);
        // ll.print();
        // System.out.println("Size of Linked list: " + ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println("Size of Linked list: " + ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println("Size of Linked list: " + ll.size);
        // System.out.println(ll.searchRec(9));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();
        // for palindrome
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // System.out.println(ll.checkPalindrome());
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
// it is class of nodes which have object
// TC: O(1) of both addlast and addfirst
// TC: O(1) of add node in the middle
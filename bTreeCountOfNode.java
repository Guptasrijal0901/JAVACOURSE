import java.util.*;

import org.w3c.dom.Node;

public class bTreeCountOfNode {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int lCount = countNode(root.left);
        int rCount = countNode(root.right);
        return lCount + rCount + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Total Count of nodes: " + countNode(root));
    }

}

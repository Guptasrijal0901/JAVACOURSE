import org.w3c.dom.Node;

public class bTreeLCA2 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca2(Node root, int n1, int n2) {
        // leftLCA = null and rightLCA = null
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLCA = lca2(root.left, n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);

        // leftLCA = valid and rightLCA = null
        if (rightLCA == null) {
            return leftLCA;
        }
        // leftLCA = null and rightLCA = valid
        if (leftLCA == null) {
            return rightLCA;
        }
        // leftLCA = valid and rightLCA = valid
        // dono taraf ek ek value hai -> left mai bhi or right mai bhi
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        System.out.println(lca2(root, n1, n2).data);
    }

}

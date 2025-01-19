import java.util.*;

public class bTreeTopView {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        // Queue for level order traversal
        Queue<Info> q = new LinkedList<>();
        // Map to store the first node at each horizontal distance
        HashMap<Integer, Node> map = new HashMap<>();

        // Track minimum and maximum horizontal distances
        int min = 0, max = 0;

        // Initialize the queue with the root node
        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            // Check if this horizontal distance is already seen
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            // Update the min and max horizontal distances
            min = Math.min(min, curr.hd);
            max = Math.max(max, curr.hd);

            // Add the left and right children to the queue
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
            }
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
            }
        }

        // Print the top view from min to max horizontal distances
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root); // Expected output: 4 2 1 3 7
    }
}

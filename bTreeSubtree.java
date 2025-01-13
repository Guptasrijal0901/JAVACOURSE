import org.w3c.dom.Node;
import java.utill.*;

public class bTreeSubtree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null || node.data != subRoot.data) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subNode.left)) {
            return false;
        }
        if (!isIdentical(node.right, subNode.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
    }
}
// given the roots of two bimary tree root and subroot,
// return true if there is a subtree of root with the same structure and node
// values of subroot anf false otherwise.
// APPROACH
// 1. FIND SUBROOT IN TREE
// 2. CHECK IDENTICAL(SUBROOT, NODE SUBTREE)
// NON IDENTICAL CONDITIONS:
// 1. node.data!= subroot.data
// 2. node=null || subroot = nul
// 3. leftsubtree -> non identical
// 4. rightsubtree -> non identical
import org.w3c.dom.Node;

public class bTreeLCA {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;

    }

}
// APROACH:
// 1. root se number tk path calculate karna h
// 2. loop se last common node nikal lo
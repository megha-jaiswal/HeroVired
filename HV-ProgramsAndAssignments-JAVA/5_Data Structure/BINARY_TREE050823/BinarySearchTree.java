package BINARY_TREE050823;

class Node1 {
    int value;
    Node1 left;
    Node1 right;

    public Node1(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {

    public Node1 insert(int value, Node1 current) {
        if (current == null) {
            Node1 node = new Node1(value);
            return node;
        } else {
            if (value < current.value) {
                current.left = insert(value, current.left);
            } else {
                current.right = insert(value, current.right);
            }
            return current;
        }
    }

    public static void preorder(Node1 current) {
        if (current == null) {
            return;
        } else {
            System.out.print(current.value + " ");
            preorder(current.left);
            preorder(current.right);
        }
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node1 root = null;

        root = tree.insert(50, root);
        tree.insert(30, root);
        tree.insert(20, root);
        tree.insert(40, root);
        tree.insert(70, root);
        tree.insert(60, root);
        tree.insert(80, root);

        System.out.println("Preorder Traversal:");
        preorder(root);
    }
}
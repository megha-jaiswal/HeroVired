package BINARY_TREE050823;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BST {

    public static void main(String[] args) {
        Node node1 = new Node(10);
        node1.left = new Node(20);
        node1.right = new Node(30);
        node1.left.left = new Node(40);
        node1.left.right = new Node(50);
        node1.right.left = new Node(70);
        node1.right.right = new Node(60);

//        System.out.println("Breadth First Search");
//        BST.breadthFirstSearch(node1);
//        System.out.println();
//        System.out.println("Depth First Search");
//        BST.depthFirstSearch(node1);
//        System.out.println();
//        System.out.println();
//        BST.printDisplay(node1,0);

        BST bst = new BST();
        Node current = new Node(50); // root node.
        bst.insert(20, current);
        bst.insert(10, current);
        bst.insert(70, current);
        bst.insert(55, current);
        bst.insert(50, current);
        bst.insert(60, current);
        bst.insert(80, current);


        System.out.println();
        System.out.println("Binary Search Tree");
        printDisplay(current, 0);

//        System.out.println("Max Value: " + max(current));
//        System.out.println("Min Value: " + min(current));


//        preOrder(current);
//        System.out.println("Pre-Order");
//        inOrder(current);
//        System.out.println("In-Order");
//        postOrder(current);
//        System.out.println("Post-Order");

        delete(current,20);
        printDisplay(current,0);
    }

    private static void breadthFirstSearch(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.value + " ");

            if (node.left != null)
                queue.add(node.left);

            if (node.right != null)
                queue.add(node.right);
        }
    }

    public static void depthFirstSearch(Node root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        depthFirstSearch(root.left);
        depthFirstSearch(root.right);
    }

    private static void printDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        printDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        printDisplay(node.left, level + 1);
    }

    public static void preOrder(Node current) {
        if (current == null) {
            return;
        } else {
            System.out.print(current.value + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }

    public static void inOrder(Node current) {
        if (current == null) {
            return;
        }
        inOrder(current.left);
        System.out.print(current.value + " ");
        inOrder(current.right);
    }

    public static void postOrder(Node current) {
        if (current == null) {
            return;
        }
        postOrder(current.left);
        postOrder(current.right);
        System.out.print(current.value + " ");

    }

    public static int max(Node current) {
        if (current == null) {
            return -1;
        }
        while (current.right != null)
            current = current.right;

        return current.value;
    }

    public static int min(Node current) {
        if (current == null) {
            return -1;
        }
        while (current.left != null)
            current = current.left;

        return current.value;
    }

    public static Node delete(Node current, int key) {
        if (current == null) {
            return null;
        }

        if (key < current.value) {
            current.left = delete(current.left, key);
        } else if (key > current.value) {
            current.right = delete(current.right, key);
        } else {
//            No Child
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) { /* One child**/
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else { /* Two child**/
                Node successor = inOrderSuccessor(current.right);
                current.value = successor.value;
                current.right = delete(current, successor.value);
                current.right = delete(current.right, successor.value);
//                current.right = delete(current.right, current.value);
            }
        }
        return current;
    }

    private static Node inOrderSuccessor(Node current) {
        while (current.left!=null){
            current = current.left;
        }
        return current;
    }

    public boolean search(Node current, int searchvalue) {
        if (current == null) {
            return false;
        }

        if (searchvalue == current.value) {
            return true;
        } else if (searchvalue < current.value) {
            return search(current.left, searchvalue);
        } else {
            return search(current.right, searchvalue);
        }
    }

    public Node insert(int value, Node current) {
        if (current == null) {
            Node node = new Node(value);
            return node;
        } else {
            if (value < current.value) {
                current.left = insert(value, current.left);
            } else {
                current.right = insert(value, current.right);
            }
        }
        return current;
    }


}

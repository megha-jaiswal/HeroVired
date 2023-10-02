class Node1 {
    int value;
    Node1 left;
    Node1 right;
    Node1 Current;

    public Node1(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree2 {

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
            System.out.println(current.value + " ");
            preorder(current.left);
            preorder(current.right);
        }
    }

    public static boolean search(int searchvalue, Node1 current) {
        if (current == null) {
            return false;
        }
        if (searchvalue == current.value) {
            return true;
        } else {
            if (searchvalue < current.value) {
                return search(searchvalue, current.left);
            } else {
                return search(searchvalue, current.right);
            }
        }
    }

    public static int maxValue(Node1 current) {
        Node1 maxValue = current;
        if (maxValue.right == null) {
            return maxValue.value;
        }
//        if (maxValue.right !=null){
//            maxValue= current.right;
//        }
        return maxValue(maxValue.right);
    }

    public static void main(String[] args) {
        BinarySearchTree2 var = new BinarySearchTree2();
        Node1 current = new Node1(50);
        //var.insert(50,current);
        var.insert(70, current);
        var.insert(30, current);
        var.insert(90, current);
        var.insert(20, current);
        var.insert(10, current);
        var.insert(500, current);

        var.preorder(current);

        System.out.println(var.search(100, current));
        //System.out.println("max value" + maxValue);
    }

    public static Node1 delete(Node1 current, int key) {
        if (current == null) {
            return null;
        }
        if (key < current.value) {
            current.left = delete(current.left, key);
        } else if (key > current.value) {
            current.right = delete(current.right, key);
        } else {
            //No child
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else { //two child
                Node1 successor = inOrderSucessor(current.right);
                current.value = successor.value;
                current.right = delete(current, successor.value);
            }
        }
        return current;
    }

    private static Node1 inOrderSucessor(Node1 current){
        while (current.left !=null){
            current = current.left;
        }
        return current;
    }

}




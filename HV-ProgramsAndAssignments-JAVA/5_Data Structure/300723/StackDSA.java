public class StackDSA {
    private Node head;

    private int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    StackDSA(int data) {
        Node newNode = new Node(data);
        this.head = newNode;
        this.size = 1;
    }

    public void printStackDSA() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        StackDSA sdsa = new StackDSA(1);

        sdsa.push(2);
        sdsa.push(3);
        sdsa.push(4);

        sdsa.pop();

        sdsa.printStackDSA();

        System.out.println("Size: " + sdsa.getSize());

    }
}

package queue;

public class CustomLinkedList {
    public Node head;
    public int size = 0;

    public int getSize() {
        return size;
    }

    public CustomLinkedList() {
        this.head = null;
    }

//    public void addToHead(int data) {
//        Node currentHead = this.head;
//        this.head = new Node(data);
//        if (currentHead != null) {
//            this.head.next = currentHead;
//        }
//        size++;
//    }

    public void dequeue() {
        Node removedHead = this.head;
        if (removedHead == null) {
            System.out.println("Empty");
            return;
        }
        this.head = removedHead.next;
        size--;
    }

    public void enqueue(int data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = new Node(data);
        }
        size++;
    }

    public void print() {
        Node currentHead = this.head;
        while (currentHead != null) {
            System.out.print(currentHead.data + " ");
            currentHead = currentHead.next;
        }
    }


    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();
        ll.enqueue(1);
        ll.enqueue(2);
        ll.enqueue(3);
        ll.print();
        System.out.println();
        ll.dequeue();
        ll.print();


    }

}

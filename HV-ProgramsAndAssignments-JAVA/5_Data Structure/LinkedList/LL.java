package LinkedList;

public class LL {
    Node head;

    public LL() {
        this.head = null;
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addAtBeg(int data){
        Node newNode= new Node(data);
        newNode.next =head;
        head= newNode;
    }

    public void addInMiddle(int data, int pos){
        Node newNode= new Node(data);
        if (pos <= 0){
            newNode.next =head;
            head= newNode;
            return;
        }
        Node current = head;
        int i=0;
        while (current != null && i<(pos-1)){
            current= current.next;
            i++;
            }
               if (current== null){
            System.out.println("Invalid position");
        }
        newNode.next= current.next;
        current.next= newNode;
    }

    public void Display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ":");
            current = current.next;
        }
    }
}

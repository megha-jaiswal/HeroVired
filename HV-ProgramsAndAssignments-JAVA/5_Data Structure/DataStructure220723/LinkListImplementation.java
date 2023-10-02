package DataStructure220723;

class node
{
    public Object item;
    public node next;
}

public class LinkListImplementation {
    public node head;
    public int size;

    public LinkListImplementation() {
        this.head = null;
        this.size = 0;
            }


    public void insertionAtEnd(String value) {
        node n1 = new node();
        n1.item = value;
        node current = this.head;
        if (this.head == null) {
            this.head = n1;
            this.head.next = null;
            this.size = 1;
        } else {
            //traverse the link list
            //find the tail
            //add the node
            while (current.next != null) {
                current = current.next;

            }
            current.next = n1;
            n1.next = null;
            this.size += 1;

        }

    }

    public void insertAtBeginning(String value){
        node newnode = new node();
        newnode.item = value;

        newnode.next = head;
        this.head = newnode;
        this.size =this.size+1;
    }

    public void instertionAtnthposition (String value, int position) {
        node n1 = new node();
        n1.item = value;
        node current = this.head;
        if (this.head != null && position <= size) {
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            n1.next = current.next;
            current.next = n1;
            this.size += 1;
        } else {
            System.out.println("Position not in Range");
        }
    }
        public void printNodes() {
            if (this.size < 1)
                System.out.println("There are no nodes in the linked list");
            else {
                node current = this.head;
                for (int i = 0; i < this.size; i++) {
                    System.out.println("Node " + current.item + " is at location " + i);
                    current = current.next;
                }
            }
        }
    //public class LinkListImplementation{
    public static void main(String[] args) {
        LinkListImplementation l1= new LinkListImplementation();
        l1.insertAtBeginning("20");
        l1.insertAtBeginning("30");
        l1.insertAtBeginning("40");
        l1.insertionAtEnd("100");
        l1.instertionAtnthposition("50", 2);
        l1.printNodes();

    }

    /// for deletion in DSA refer linkedListAssignment sheet




}



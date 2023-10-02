package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtBeg(30);
        list.addInMiddle(50,3);
        list.addInMiddle(5,0);
        list.addInMiddle(100,5);
        list.Display();

    }
}

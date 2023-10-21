class Task {
    String desc;
    Boolean status;

    public Task(String desc) {
        this.desc = desc;
        this.status = false;
    }
}
class Node{
    Task T1;
    Node Nextnode;

    public Node(Task t1) {
        this.T1 = T1;
        this.Nextnode= null;

    }
}
class todo {
    Node head;

    public void additems(String desc) {
        Task T1 = new Task(desc);
        Node newNode = new Node(T1);

        if (head == null) {
            this.head = newNode;

        } else {
            newNode.Nextnode = head;
            this.head = newNode;
        }
    }

    public void StatusChange(String description){
        Node current = head;
        while (current != null){
            if (current.T1.desc.equals(description)){
                current.T1.status= true;
                break;
            }
            current = current.Nextnode;
        }
    }
    public void remove(String description){
        if (head== null){
            return;
        }
        if (head.T1.desc.equals(description)){
            head= head.Nextnode;
        }
        Node prev=null;
        Node current=head;
        while (current != null) {
            if (current.T1.desc.equals(description)){
                prev.Nextnode=current.Nextnode;
                break;
            }
            prev=current;
            current= current.Nextnode;
        }
    }
    public void printTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(
                    "Task: " + current.T1.desc + " | Status: " + (current.T1.status ? "Completed" : "Not Completed"));
            current = current.Nextnode;
        }

    }}
public class ToDoList2 {
    public static void main(String[] args) {
        todo todoList = new todo();

        // Adding tasks
        todoList.additems("Buy groceries");
        todoList.additems("Finish homework");
        todoList.additems("Go for a run");

        // Changing task status
        todoList.StatusChange("Finish homework");

        // Removing a task
        todoList.remove("Buy groceries");

        // Print the tasks and their statuses
        todoList.printTasks();
    }
}



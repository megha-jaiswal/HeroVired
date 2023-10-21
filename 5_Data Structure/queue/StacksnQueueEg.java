package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StacksnQueueEg {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("ABC"); /// add through exception.
        queue.offer("DEF"); // offer throws boolen value
        queue.offer("GHI");
        queue.offer("JKL");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.remove());
        System.out.println(queue);


    }

}
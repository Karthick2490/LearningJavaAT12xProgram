package Exercise32_Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab238_Queue {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue(); //Natural sorting
        queue.add("Karthick");
        queue.add("A1");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

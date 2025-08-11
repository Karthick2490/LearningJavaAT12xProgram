package Exercise32_Collections.Queue;

import java.util.*;

public class Lab240_LinkedListasQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(7);
        queue.add(3);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.offer(3);
        queue.add(10);
        System.out.println(queue);
        System.out.println(queue.element());
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext())
        {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}

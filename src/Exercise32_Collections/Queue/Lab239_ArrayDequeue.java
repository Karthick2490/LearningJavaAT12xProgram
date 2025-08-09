package Exercise32_Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab239_ArrayDequeue {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.push(5);
        deque.push(3);
        System.out.println(deque);
    }
}

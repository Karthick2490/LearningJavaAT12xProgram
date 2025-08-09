package Exercise32_Collections.List;

import java.util.Stack;

public class Lab233_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("Karthick");
        stack.add("Kumar");
        stack.add("Karthick");
        stack.add("Bharathi");
        stack.add("Lime");

        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.empty());

        stack.push("Love");
        System.out.println(stack);

        stack.add("Adding");
        System.out.println(stack);

        System.out.println(stack.get(0));
        stack.remove(5);
        System.out.println(stack);
    }
}

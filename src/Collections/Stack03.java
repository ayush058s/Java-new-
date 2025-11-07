package Collections;

// stack extends vector class
// LIFO => last in first out,ex = stack of books
// LinkedList can act as Stack
import java.util.Stack;

public class Stack03 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(4);
        System.out.println(stack);

        // removes last
        stack.pop();
        System.out.println(stack);

        // to check last/top value
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());// false
        System.out.println(stack.size()); // 4

        // search index of ele from top. starts from 1
        System.out.println(stack.search(5)); //1
    }
}

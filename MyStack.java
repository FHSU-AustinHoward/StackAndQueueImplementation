/**
 * class MyStack: A stack class implemented by using ArrayList
 * All stack elements are stored in an ArrayList. The top element
 * has index top
 *
 * @author Austin Howard
 * @version Jun 20, 2024
 */
import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> stack;

    /**
     * Constructor to initialize the stack.
     */
    public MyStack() {
        stack = new ArrayList<>();
    }

    /**
     * Pushes a value onto the stack.
     *
     * @param value the value to push
     */
    public void push(int value) {
        stack.add(value);
    }

    /**
     * Pops a value from the stack.
     *
     * @return the value popped from the stack
     * @throws IllegalStateException if the stack is empty
     */
    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the size of the stack.
     *
     * @return the size of the stack
     */
    public int size() {
        return stack.size();
    }

    /**
     * Peeks at the top value of the stack without removing it.
     *
     * @return the top value of the stack
     * @throws IllegalStateException if the stack is empty
     */
    public int peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }
}

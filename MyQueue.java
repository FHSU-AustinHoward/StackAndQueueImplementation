/**
 * class MyQueue implemented using ArrayList. The index 0 element is the front of the queue
 * The last element of the queue has index tail
 *
 * @author Austin Howard
 * @version Jun 20, 2024
 */
import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> queue;

    /**
     * Constructor to initialize the queue.
     */
    public MyQueue() {
        queue = new ArrayList<>();
    }

    /**
     * Enqueues an element to the end of the queue.
     *
     * @param value the element's value to enqueue
     */
    public void enqueue(int value) {
        queue.add(value);
    }

    /**
     * Dequeues an element from the front of the queue.
     *
     * @return the element's value dequeued from the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public int dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Returns the size of the queue.
     *
     * @return the size of the queue
     */
    public int size() {
        return queue.size();
    }

    /**
     * Peeks at the front element of the queue without removing it.
     *
     * @return the queue's front element value
     * @throws IllegalStateException if the queue is empty
     */
    public int peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }
}
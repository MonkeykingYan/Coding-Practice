package StackQueues;

import java.util.Stack;

public class MyQueue {

    Stack s1;
    Stack s2;


    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        s1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        int res = (Integer) s2.pop();

        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return res;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        int res = (Integer) s2.peek();

        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return res;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.empty();
    }
}

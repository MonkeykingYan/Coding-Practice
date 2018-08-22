package StackQueues;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */

//Idea: 2 stacks, and one is used just for storing the min value in current state.
class MinStack {

    /**
     * initialize your data structure here.
     */

    private Stack<Integer> stack;
    private Stack<Integer> minValueStack;

    public MinStack() {
        this.stack = new Stack<>();
        minValueStack = new Stack<>();
    }

    public void push(int x) {
        this.stack.push(x);
        if (!minValueStack.isEmpty()) {
            if (x <= minValueStack.peek()) {
                this.minValueStack.push(x);
            }
        } else {
            this.minValueStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minValueStack.peek())) minValueStack.pop();
            this.stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValueStack.peek();
    }

    public static void main(String[] argv) {
        // Test
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.getMin());
    }
}

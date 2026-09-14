class MyQueue {
    Stack<Integer> stack = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        
        // Hold the top element in the recursion call stack
        int top = stack.pop();
        
        // Recursively insert the new element at the bottom
        push(x);
        
        // Put the held element back on top
        stack.push(top);
    }
    
    public int pop() {
        return stack.pop();
    }
    
    public int peek() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
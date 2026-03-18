class MyQueue {
     Stack<Integer> stack;
     Stack<Integer> helperstack;
    public MyQueue() {
      stack = new Stack<>();
      helperstack = new Stack<>();  
    }
    
    public void push(int x) {
        while(!stack.isEmpty()){
            helperstack.push(stack.pop());
        }
        stack.push(x);
        while(!helperstack.isEmpty()){
            stack.push(helperstack.pop());
        }
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
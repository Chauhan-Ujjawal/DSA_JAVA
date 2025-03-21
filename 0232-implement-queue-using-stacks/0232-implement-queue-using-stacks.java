class MyQueue {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        //moving all elements from stack1 to stack2 to maintain fifo order
        while(!stack1.isEmpty()){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        //enetering desired element in stack
        stack1.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.peek());
            stack2.pop();
        }
        
    }   
    public int pop() {
        if(stack1.isEmpty()) return -1;
        int val=stack1.peek();
        stack1.pop();
        return val;
    }   
    public int peek() {
        if(stack1.isEmpty()) return -1;
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
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
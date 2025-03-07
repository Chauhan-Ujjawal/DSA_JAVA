
class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public MyStack() { }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int topElement = q1.poll();  // Last element
        swapQueues();
        return topElement;
    }

    public int top() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int topElement = q1.peek();
        q2.add(q1.poll());  // Move last element to q2
        swapQueues();
        return topElement;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    private void swapQueues() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
}

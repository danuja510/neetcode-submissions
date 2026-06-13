class MinStack {
    List<Integer> stack;
    PriorityQueue<Integer> p;
    Integer pointer;
    Integer min;
    public MinStack() {
        stack = new ArrayList();
        p = new PriorityQueue<>();
        pointer = 0;
    }

    public void push(int val) {
        stack.add(pointer++, val);
        p.add(val);
    }

    public void pop() {
        p.remove(top());
        stack.remove(pointer - 1);
        pointer--;
    }

    public int top() {
        return stack.get(pointer - 1);
    }

    public int getMin() {
        return p.peek();
    }
}

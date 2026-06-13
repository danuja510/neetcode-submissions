class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> operands = new LinkedList();
        for (String s : tokens) {
            if (s.equals("+") && !operands.isEmpty()) {
                int i = operands.removeLast();
                i = operands.removeLast() + i;
                System.out.println(i);

                operands.addLast(i);
            } else if (s.equals("-") && !operands.isEmpty()) {
                int i = operands.removeLast();
                i = operands.removeLast() - i;

                operands.addLast(i);
            } else if (s.equals("*") && !operands.isEmpty()) {
                int i = operands.removeLast();
                i = operands.removeLast() * i;

                operands.addLast(i);
            } else if (s.equals("/") && !operands.isEmpty()) {
                int i = operands.removeLast();
                i = operands.removeLast() / i;

                operands.addLast(i);
            } else {
                operands.addLast(Integer.parseInt(s));
            }
        }
        return operands.removeFirst();
    }
}

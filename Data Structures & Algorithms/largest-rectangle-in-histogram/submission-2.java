class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack();
        int min = 0;
        int area = 0;
        for (int i : heights) {
            int tempArea = 0;
            if (stack.isEmpty()) {
                min = i;
                stack.push(i);
                if (i > area) {
                    area = i;
                }
            } else {
                if (i < min)
                    min = i;
                tempArea = min * (stack.size() + 1);
                if (i >= tempArea) {
                    stack.clear();
                    min = i;
                    stack.push(i);
                    if (i > area) {
                        area = i;
                    }
                } else if (tempArea >= stack.peek()) {
                    stack.push(tempArea);
                    if (tempArea > area) {
                        area = tempArea;
                    }
                } else {
                    stack.clear();
                    min = 0;
                }
            }
        }
        stack.clear();
        for (int i = heights.length - 1; i >= 0; i--) {
            int tempArea = 0;
            if (stack.isEmpty()) {
                min = heights[i];
                stack.push(heights[i]);
                if (heights[i] > area) {
                    area = heights[i];
                }
            } else {
                if (heights[i] < min)
                    min = heights[i];
                tempArea = min * (stack.size() + 1);
                if (heights[i] >= tempArea) {
                    stack.clear();
                    min = heights[i];
                    stack.push(heights[i]);
                    if (heights[i] > area) {
                        area = heights[i];
                    }
                } else if (tempArea >= stack.peek()) {
                    stack.push(tempArea);
                    if (tempArea > area) {
                        area = tempArea;
                    }
                } else {
                    stack.clear();
                    min = 0;
                }
            }
        }
        return area;
    }
}

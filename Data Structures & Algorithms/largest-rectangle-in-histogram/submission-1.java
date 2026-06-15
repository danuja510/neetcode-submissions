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
                    System.out.println(area);
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
                        System.out.println(area);
                    }
                } else if (tempArea >= stack.peek()) {
                    stack.push(tempArea);
                    if (tempArea > area) {
                        area = tempArea;
                        System.out.println(area);
                    }
                } else {
                    stack.clear();
                    min = 0;
                    System.out.println("-----");
                }
            }
        }
        stack.clear();
        System.out.println("---------");
        for (int i = heights.length - 1; i >= 0; i--) {
            int tempArea = 0;
            if (stack.isEmpty()) {
                min = heights[i];
                stack.push(heights[i]);
                if (heights[i] > area) {
                    area = heights[i];
                    System.out.println(area);
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
                        System.out.println(area);
                    }
                } else if (tempArea >= stack.peek()) {
                    stack.push(tempArea);
                    if (tempArea > area) {
                        area = tempArea;
                        System.out.println(area);
                    }
                } else {
                    stack.clear();
                    min = 0;
                    System.out.println("-----");
                }
            }
        }
        return area;
    }
}

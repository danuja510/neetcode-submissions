class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] output = new int[nums.length - (k - 1)];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k - 1; i++) {
            maxHeap.add(nums[i]);
        }

        for (int i = 0, j = k - 1; j < nums.length; i++, j++) {
            maxHeap.add(nums[j]);
            output[i] = maxHeap.peek();
            maxHeap.remove(nums[i]);
        }
        return output;
    }
}

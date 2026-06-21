class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int selection = (j + i) / 2;
            if (nums[selection] == target) {
                return selection;
            } else if (nums[selection] > target) {
                j = selection - 1;
            } else {
                i = selection + 1;
            }
        }
        return -1;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap();
        for(int i=0; i < nums.length; i++){
            int find = target - nums[i];
            if (values.get(find) != null)
                return new int[]{values.get(find), i};
            else
                values.put(nums[i], i);
        }
        return new int[]{-1, -1};

    }
}

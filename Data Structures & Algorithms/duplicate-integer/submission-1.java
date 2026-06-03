class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (0 <= nums.length && nums.length <= Math.pow(10,5)){
            Set<Integer> numFrequency= new HashSet();
            for(int i = 0; i< nums.length; i++){
                if(numFrequency.contains(nums[i]))
                    return true;
                else
                    numFrequency.add(nums[i]);
            }
        }
        return false;
    }
}
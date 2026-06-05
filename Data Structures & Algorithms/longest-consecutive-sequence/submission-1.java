class Solution {
    public int longestConsecutive(int[] nums) {
        int currentLongestLength =0;
        int currentLength = 0;
        Arrays.sort(nums);
        for(int i=0; i< nums.length; i++){
            if(i != 0 && nums[i]-1 == nums[i-1]){
                currentLength++;
            }else if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }else{
                currentLength = 1;
            }
            if (currentLength>=currentLongestLength){
                    currentLongestLength = currentLength;
                }
        }
        return currentLongestLength;
    }
}

class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int l = 0, r = nums.length - 1;
        while(l<=r){
            int k = (l+r)/2;
            if(nums[k]<min)
                min= nums[k];
            if(nums[k]>nums[r]){
                l=k+1;
            }else{
                r=k-1;
            }
        }
        return min;
    }
}

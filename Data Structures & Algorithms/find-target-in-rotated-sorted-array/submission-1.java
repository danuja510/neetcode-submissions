class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1, k=findMin(nums);
        while(l<=r){
            if(nums[k]==target)
                return k;
            if(target>nums[k] && target <= nums[r])
                l=k+1;
            else
                r=k-1;
            
            k = (l+r)/2;
        }
        return -1;
    }

    public int findMin(int[] nums) {
        int min = 0;
        int l = 0, r = nums.length - 1, k = 0;
        while (l <= r) {
            k = (l + r) / 2;
            if (nums[k] < nums[min]){
                min = k;
            }
                
            if (nums[k] > nums[r]) {
                l = k + 1;
            } else {
                r = k - 1;
            }
        }
        return min;
    }
}

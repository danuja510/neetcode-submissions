class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1, k=0;
        while(l<=r){
            k = (l+r)/2;
            System.out.println(l+"|"+r+"|"+nums[k]);
            if(nums[k]==target)
                return k;
            if((nums[k]<=nums[r] && (nums[k]< target && nums[r]>= target)) || (nums[k]>= nums[l] && (nums[k]<target || nums[l]> target)))
                l=k+1;
            else
                r=k-1;
            
        }
        return -1;
    }

    
}

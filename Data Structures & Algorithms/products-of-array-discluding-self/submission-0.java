class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int[] postfixArr = new int[nums.length];
        int[] res = new int[nums.length];
        int prefix= 1;
        for (int i= 0; i< nums.length; i++){
            prefix*=nums[i];
            prefixArr[i]= prefix;
        }
        int postfix = 1;
        for (int i=nums.length-1; i>= 0; i--){
            if(i == 0){
                res[i]=postfix;
            }else{
                res[i]= postfix * prefixArr[i-1];
            }
            
            postfix*=nums[i];
            postfixArr[i]= postfix;
        }
        return res;
    }
}  

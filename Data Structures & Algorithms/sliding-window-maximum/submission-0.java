class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] output = new int[nums.length -(k-1)];

        for(int i =0, j = k-1; j< nums.length; i++,j++){
            int[] temp = Arrays.copyOfRange(nums, i, j+1);
            Arrays.sort(temp);
            output[i] = temp[temp.length -1];
        }
        return output;
    }
}

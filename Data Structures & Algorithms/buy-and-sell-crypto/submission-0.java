class Solution {
    public int maxProfit(int[] prices) {
        int low=101;
        int currentProfit =0;
        for(int i: prices){
            if (i< low){
                low = i;
            }else if(i-low > currentProfit){
                currentProfit = i-low;
            }
        }
        return currentProfit;
    }
}

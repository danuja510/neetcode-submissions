class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int max = piles[piles.length - 1];
        if (piles.length == h)
            return max;
        int tempH=0;
        int k = max;
        int returnK =max;
        while (tempH<= h && k>0){
            k--;
            int i = Arrays.binarySearch(piles, k);
            if(i>=0){
                tempH= i;
                System.out.println(k+ "-"+tempH);
                for(int j=i; j< piles.length; j++){
                    tempH+=Math.ceilDiv(piles[j], k);
System.out.println(k+ "-"+tempH);
                }
                if(tempH<= h && k<returnK){
                    
                   returnK=k; 
                }
            }

        }
        return returnK;
    }
}

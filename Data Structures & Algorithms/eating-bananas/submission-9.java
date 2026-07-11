class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int max = piles[piles.length - 1];
        long tempH = 0;
        int k = 1;
        while (k < max) {
            tempH = 0;
            for (int j = 0; j < piles.length; j++) {
                tempH += Math.ceilDiv(piles[j], k);
            }

            if (tempH <= h) {
                return k;
            }
            k++;
        }
        return max;
    }
}

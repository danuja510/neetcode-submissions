class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int l = 1, r = max;
        int returnK = max;
        int tempH = 0;
        while (l <= r) {
            int k = (l + r) / 2;
            tempH = 0;
            for (int j = 0; j < piles.length; j++) {
                tempH += Math.ceilDiv(piles[j], k);
            }
            if (tempH <= h) {
                if (returnK > k)
                    returnK = k;
            }
            if (tempH <= h) {
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return returnK;
    }
}

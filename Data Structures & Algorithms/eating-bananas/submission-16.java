class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int returnK= max, r= max, tempH =0, l=1, k=0;
        while (l <= r) {
            k = (l + r) / 2;
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

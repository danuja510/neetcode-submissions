class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];

        int maxHeight = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
            prefix[i] = maxHeight;
        }
        maxHeight = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
            suffix[i] = maxHeight;
        }

        int volume = 0;
        for (int i = 0; i < height.length; i++) {
            if(Math.min(prefix[i], suffix[i]) - height[i] > 0)
            volume += Math.min(prefix[i], suffix[i]) - height[i];
        }

        return volume;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1, currentMax= 0;
        while(i< j){
            int length = j-i;
            int maxHeight = 0;
            if(heights[i]> heights[j]){
                maxHeight= heights[j];
                j--;
            }else{
                maxHeight= heights[i];
                i++;
            }
            int vol = maxHeight * length;
            if(vol> currentMax){
                currentMax= vol;
            }
        }
        return currentMax;
    }
}

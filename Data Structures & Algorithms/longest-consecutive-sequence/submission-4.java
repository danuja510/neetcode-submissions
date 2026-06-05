class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());;
        int currentLength = 0;
        for(Integer num: numSet){
            if (!numSet.contains(num-1)){
                int length = 0;
                while (numSet.contains(num+length)){
                    length++;
                    if(length>currentLength)
                        currentLength = length;
                }
            }
        }
        return currentLength;
    }
}

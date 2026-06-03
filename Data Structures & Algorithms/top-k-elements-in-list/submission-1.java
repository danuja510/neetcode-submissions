class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap();
        for(int i= 0; i < nums.length; i++){
            if (frequencies.get(nums[i])!= null)
             frequencies.put(nums[i], frequencies.get(nums[i])+1);
            else
                frequencies.put(nums[i], 1);
        }
        List<Integer>[] counts = new List[nums.length + 1];
        for(Integer key: frequencies.keySet()){
            int freq = frequencies.get(key);
            if(counts[freq] == null)
                counts[freq] = new ArrayList<>();
            counts[freq].add(key);
        }
        List<Integer> returnList = new ArrayList();
        for(int i = nums.length; i>0; i--){
            if(counts[i] == null)
                continue;
            for(Integer j: counts[i]){
                returnList.add(j);
                if(returnList.size()==k){
                    return returnList.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }

        return returnList.stream().mapToInt(Integer::intValue).toArray();

  }
    
}

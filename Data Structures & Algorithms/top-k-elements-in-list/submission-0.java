class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap();
        for(int i= 0; i < nums.length; i++){
            if (frequencies.get(nums[i])!= null)
             frequencies.put(nums[i], frequencies.get(nums[i])+1);
            else
                frequencies.put(nums[i], 1);
        }
        Map<Integer, Integer> sfrequencies = frequencies.entrySet()
  .stream()
  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
  .limit(k).collect(Collectors.toMap(
    Map.Entry::getKey, 
    Map.Entry::getValue, 
    (oldValue, newValue) -> oldValue, LinkedHashMap::new));;
  return sfrequencies.keySet().stream().mapToInt(Integer::intValue).toArray();
  }
    
}

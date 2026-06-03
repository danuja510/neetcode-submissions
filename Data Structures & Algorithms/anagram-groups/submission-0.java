class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> frequency= new HashMap();
        List<List<String>> returnList = new ArrayList();
        for(String str: strs){
            char[] anagram = str.toCharArray();
            Arrays.sort(anagram);
            String sorted = new String(anagram);
            if (frequency.get(sorted) != null)
                frequency.get(sorted).add(str);
            else{
                ArrayList newArr = new ArrayList(List.of(str));
                frequency.put(sorted, newArr);
                returnList.add(newArr);
            }
                
        }
        return returnList;
    }
}

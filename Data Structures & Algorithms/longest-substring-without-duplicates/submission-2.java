class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int returnLenght = 0;

        for (int i = 0; i < s.length(); i++) {
            char st = s.charAt(i);
            if (!set.contains(st)) {
                set.add(st);
            } else {
                returnLenght = set.size() > returnLenght ? set.size() : returnLenght;
                i -= set.size();
                set = new HashSet();
            }
        }
        if(!set.isEmpty()){
            returnLenght = set.size() > returnLenght ? set.size() : returnLenght;
        }

        return returnLenght;
    }
}
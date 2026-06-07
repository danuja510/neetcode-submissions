class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap();
        int returnLength = 0;
        char[] cArray = s.toCharArray();
        int i = 0, j = 0;
        while (j < cArray.length) {
            if (map.containsKey(cArray[j])) {
                map.put(cArray[j], map.get(cArray[j]) + 1);
            } else {
                map.put(cArray[j], 1);
            }
            int length = (j + 1) - i;
            int max = map.values().stream().max(Integer::compareTo).orElse(0);
            if (length <= k + max) {
                returnLength = returnLength > length ? returnLength : length;
            } else {
                map.put(cArray[i], map.get(cArray[i]) - 1);
                i++;
            }
            j++;
        }

        return returnLength;
    }
}

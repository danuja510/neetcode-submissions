class Solution {
    public int characterReplacement(String s, int k) {
        int returnLength = 0;
        char[] cArray = s.toCharArray();
        int i = 0, j = 0;
        while (j < cArray.length) {
            Map<Character, Integer> map = new HashMap();
            for (int l = i; l <= j; l++) {
                if (map.containsKey(cArray[l])) {
                    map.put(cArray[l], map.get(cArray[l]) + 1);
                } else {
                    map.put(cArray[l], 1);
                }
            }
            int length = (j + 1) - i;
            int max = map.values().stream().max(Integer::compareTo).orElse(0);
            if (length <= k + max) {
                returnLength = returnLength > length ? returnLength : length;
                j++;
            } else {
                i++;
            }
        }

        return returnLength;
    }
}

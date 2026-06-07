class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> set = s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        int returnLength = 0;
        for (Character c : set) {
            int i = s.indexOf(c);
            int j = i;
            int temp = k;
            int length = 1;
            while (i > 0 || j < s.length() - 1) {
                if (j < s.length() - 1) {
                    j++;
                    if (s.charAt(j) == c) {
                        length++;
                    } else if (temp > 0) {
                        length++;
                        temp--;
                    }
                } else if (i > 0) {
                    i--;
                    if (s.charAt(i) == c) {
                        length++;
                    } else if (temp > 0) {
                        length++;
                        temp--;
                    }
                }
                if (length > returnLength)
                    returnLength = length;
            }
        }
        return returnLength;
    }
}

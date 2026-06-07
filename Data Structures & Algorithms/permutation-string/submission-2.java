class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        Map<Character, Integer> s1Map = new HashMap();
        Map<Character, Integer> s2Map = new HashMap();
        for (char c : s1.toCharArray()) {
            if (s1Map.containsKey(c)) {
                s1Map.put(c, s1Map.get(c) + 1);
            } else {
                s1Map.put(c, 1);
            }
        }
        for (char c : s2.substring(0, s1.length()).toCharArray()) {
            if (s2Map.containsKey(c)) {
                s2Map.put(c, s2Map.get(c) + 1);
            } else {
                s2Map.put(c, 1);
            }
        }

        for (int i = 0, j = s1.length() - 1; j < s2.length();) {
            if (s1Map.equals(s2Map))
                return true;
            if (s2Map.get(s2.charAt(i)) == 1) {
                s2Map.remove(s2.charAt(i));
            } else {
                s2Map.put(s2.charAt(i), s2Map.get(s2.charAt(i)) - 1);
            }

            i++;
            j++;
            if (j < s2.length())
                if (s2Map.containsKey(s2.charAt(j))) {
                    s2Map.put(s2.charAt(j), s2Map.get(s2.charAt(j)) + 1);
                } else {
                    s2Map.put(s2.charAt(j), 1);
                }
        }
        return false;
    }
}

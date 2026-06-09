class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";

        Map<Character, Integer> tMap = new HashMap();
        Map<Character, Integer> sMap = new HashMap();

        for (char c : t.toCharArray()) {
            tMap.merge(c, 1, Integer::sum);
        }

        String returnStr = "";

        for (int i = 0, j = 0; j < s.length(); j++) {
            if (tMap.containsKey(s.charAt(j)))
                sMap.merge(s.charAt(j), 1, Integer::sum);

            while (i < j) {
                if (!tMap.containsKey(s.charAt(i)))
                    i++;
                else if (sMap.containsKey(s.charAt(i))
                    && sMap.get(s.charAt(i)) > tMap.get(s.charAt(i))) {
                    sMap.merge(s.charAt(i), -1, Integer::sum);
                    i++;
                } else
                    break;
            }

            if (sMap.keySet().equals(tMap.keySet())
                && sMap.entrySet().stream().allMatch(
                    entry -> entry.getValue() >= tMap.get(entry.getKey()))) {
                if (returnStr.length() == 0 || returnStr.length() > (j + 1) - i) {
                    returnStr = s.substring(i, j + 1);
                }
            }
        }

        return returnStr;
    }
}

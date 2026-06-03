class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sList = s.toCharArray();
        char[] tList = t.toCharArray();
        Arrays.sort(sList);
        Arrays.sort(tList);
        if(new String(sList).equals(new String(tList)))
            return true;
        else
            return false;


    }
}

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }
        var s1 = cleaned.toString().toCharArray();
        for(int i=0, j=s1.length-1; i< s1.length; i++, j--){
            if(i==j || i>j) return true;;
            if(s1[i]!= s1[j]) return false;
        }
        return true;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack= new Stack();
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }
        String s1 = cleaned.toString();
        for(char c: s1.toCharArray()){
            stack.push(c);
        }
        String s2 = "";
        while(!stack.isEmpty()){
            s2+=stack.pop();
        }
        return s1.equals(s2);
    }
}

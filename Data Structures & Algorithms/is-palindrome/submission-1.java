class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack= new Stack();
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }
        for(char c: cleaned.toString().toCharArray()){
            stack.push(c);
        }
        String s2 = "";
        while(!stack.isEmpty()){
            s2+=stack.pop();
        }
        return cleaned.toString().equals(s2);
    }
}

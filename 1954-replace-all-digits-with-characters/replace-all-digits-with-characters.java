class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                sb.append(ch);
            } else {
                int d = ch - '0';
                char newChar = (char) (s.charAt(i - 1) + d);
                sb.append(newChar);
            }
        }
        return sb.toString();
    }
}
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String r = s+s;
        String t = r.substring(1,r.length()-1);
        return t.contains(s);
    }
}
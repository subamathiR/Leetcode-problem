class Solution {
    public boolean isMatch(String s, String p) {
        s = s.replace(".","").replace("*",".");
        if(s.matches(p))
        return true;
        else
        return false;
    }
}
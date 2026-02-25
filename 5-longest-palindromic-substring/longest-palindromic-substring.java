class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String res = "";
        for(int i = 0; i < s.length(); i++){
            int l = i;
            int r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            String p = s.substring(l + 1, r);
            if(p.length() > res.length()){
                res = p;
            }
            l = i;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }

            p = s.substring(l + 1, r);
            if(p.length() > res.length()){
                res = p;
            }
        }

        return res;
    }
}
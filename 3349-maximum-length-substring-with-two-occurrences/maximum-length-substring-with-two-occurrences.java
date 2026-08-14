class Solution {
    public int maximumLengthSubstring(String s) {
        int f[] = new int[26];
        int left = 0;
        int max = 0;
        for(int right = 0;right < s.length();right++){
            char ch = s.charAt(right);
            f[ch-'a']++;
            while(f[ch-'a']>2){
                f[s.charAt(left)-'a']--;
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
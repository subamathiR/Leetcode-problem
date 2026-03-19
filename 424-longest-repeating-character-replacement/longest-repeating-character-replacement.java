class Solution {
    public int characterReplacement(String s, int k) {
        int f[] = new int[26];
        int l = 0;
        int max = 0;
        int maxwin = 0;
        for(int r=0;r<s.length();r++){
            f[s.charAt(r)-'A']++;
            max = Math.max(max,f[s.charAt(r)-'A']);
            int win = r-l+1;
            if(win - max > k){
                f[s.charAt(l)-'A']--;
                l++;
            }
            win = r-l+1;
            maxwin = Math.max(maxwin,win);
        }
        return maxwin;
    }
}
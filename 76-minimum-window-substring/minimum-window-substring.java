class Solution {
    public String minWindow(String s, String t) {
        int maps[] = new int[256];
        int mapt[] = new int[256];
        for(char ch : t.toCharArray()) {
            mapt[ch]++;
        }
        int left = 0;
        int min = Integer.MAX_VALUE;
        int minstart = 0;
        for(int right = 0; right < s.length(); right++) {
            maps[s.charAt(right)]++;
            while(contains(maps, mapt)) {
             if(right - left + 1 < min) {
                    min = right - left + 1;
                    minstart = left;
                }
                maps[s.charAt(left)]--;
                left++;
            }
        }
        return min == Integer.MAX_VALUE
                ? ""
                : s.substring(minstart, minstart + min);
    }
    public boolean contains(int maps[], int mapt[]) {
        for(int i = 0; i < 256; i++) {
            if(mapt[i] > maps[i]) {
                return false;
            }
        }
        return true;
    }
}
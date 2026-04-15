import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        
        int left = 0;   // left pointer of window
        int maxLength = 0;
        
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            
            // If character already exists, move left pointer
            if (map.containsKey(ch)) {
                left = Math.max(map.get(ch) + 1, left);
            }
            
            map.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
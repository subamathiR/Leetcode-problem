import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a[] = new int[26];
        int b[] = new int[26];
        for(char c : s1.toCharArray()) {
            a[c - 'a']++;
        }
        int w = s1.length();
        for(int i = 0; i < s2.length(); i++) {
            b[s2.charAt(i) - 'a']++;
            if(i >= w) {
                b[s2.charAt(i - w) - 'a']--;
            }
            if(Arrays.equals(a, b)) {
                return true;
            }
        }
        return false;
    }
}
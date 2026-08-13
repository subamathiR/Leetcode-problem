class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        int max = 0;
        for (int i = 1; i < 26; i++) {
            if (count[i] > count[max]) {
                max = i;
            }
        }
        if (count[max] > (n + 1) / 2) {
            return "";
        }
        char[] result = new char[n];
        int index = 0;
        while (count[max] > 0) {
            result[index] = (char) (max + 'a');
            index += 2;
            count[max]--;
        }
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                if (index >= n) {
                    index = 1;
                }
                result[index] = (char) (i + 'a');
                index += 2;
                count[i]--;
            }
        }
        return new String(result);
    }
}
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        int l = 0;
        int c = 0;
        int si = 0;
        int m = Integer.MAX_VALUE;

        int f[] = new int[256];

        for (char cha : t.toCharArray()) {
            f[cha]++;
        }

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            if (f[ch] > 0) {
                c++;
            }
            f[ch]--;

            
            while (c == t.length()) {

                int win = r - l + 1;
                if (win < m) {
                    m = win;
                    si = l;
                }

                char left = s.charAt(l);
                f[left]++;

                if (f[left] > 0) {
                    c--;
                }

                l++;
            }
        }

        if (m == Integer.MAX_VALUE)
            return "";
        else
            return s.substring(si, si + m);
    }
}
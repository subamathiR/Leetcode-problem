class Solution {
    public String reverseWords(String s) {
        String w[] = s.split(" ");
        String r = "";
        for(int i = 0; i < w.length; i++) {
            StringBuilder sb = new StringBuilder(w[i]);
            r += sb.reverse().toString() + " ";
        }

        return r.trim();
    }
}
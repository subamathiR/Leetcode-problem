class Solution {
    public static boolean isvowels(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(l<r && !isvowels(ch[l])){
                l++;
            }
            while(l<r && !isvowels(ch[r])){
                r--;
            }
            char t = ch[l];
            ch[l] = ch[r];
            ch[r] = t;
            l++;
            r--;
        }
        return new String(ch);
    }
}
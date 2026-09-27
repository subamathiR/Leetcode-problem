class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int f[] = new int[256];
        for(char ch : word1.toCharArray()){
            f[ch]++;
        }
        for(char ch : word2.toCharArray()){
            f[ch]--;
        }
        for(int i=0;i<256;i++){
            if(Math.abs(f[i])>3)
                return false;

        }
        return true;
    }
}
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }
    public void backtrack(List<String> res,String s,int o,int c,int n){
        if(s.length() == 2*n){
            res.add(s);
            return;
        }
        if(o < n){
            backtrack(res,s+"(",o+1,c,n);
        }
        if(c < o){
            backtrack(res,s+")",o,c+1,n);
        }
        
    }
}
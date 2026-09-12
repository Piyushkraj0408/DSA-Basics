class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("(",1,0,n,ans);
        return ans;
    }
    static void solve(String str,int open,int close,int n,List<String> ans){
        if(open==n && close==n){
            ans.add(str);
            return;
        }
        if(open<n)
        solve(str+"(",open+1,close,n,ans);
        if(close<open)
        solve(str+")",open,close+1,n,ans);
    }
}
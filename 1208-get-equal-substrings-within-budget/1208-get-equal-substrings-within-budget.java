class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
        int ans = 0;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum += Math.abs(t.charAt(i)-s.charAt(i));
            while(sum>maxCost){
                sum -=Math.abs(t.charAt(l)-s.charAt(l));
                l++;
            }
            ans = Math.max(i-l+1,ans);
        }
        return ans;
    }
}
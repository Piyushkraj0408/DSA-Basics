class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int n = s.length();
        int l=0;
        int ans =0;
        for(int r=0;r<n;r++){
            arr[s.charAt(r)]++;
            while(arr[s.charAt(r)]>1){
                arr[s.charAt(l)]--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
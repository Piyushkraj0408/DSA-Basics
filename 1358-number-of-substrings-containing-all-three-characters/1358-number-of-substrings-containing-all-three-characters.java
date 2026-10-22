class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int l = 0;
        int n = s.length();
        int ans = 0;
        for(int r = 0;r<n;r++){
            arr[s.charAt(r)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                ans += n-r;
                arr[s.charAt(l)-'a']--;
                l++;
            }
        }
        return ans;
    }
}
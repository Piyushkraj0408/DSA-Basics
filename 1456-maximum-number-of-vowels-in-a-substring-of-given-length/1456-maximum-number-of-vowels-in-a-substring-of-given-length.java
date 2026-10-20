class Solution {
    public int maxVowels(String s, int k) {
        char[] c = s.toCharArray();
        int l = 0;
        int sum = 0;
        int count=0;
        for(int r=0;r<s.length();r++){
            if(c[r]=='a' || c[r]=='e' || c[r]=='i' || c[r]=='o' || c[r]=='u'){
                sum++;
            }
            if(r-l+1==k){
                count = Math.max(count,sum);
                char ch = c[l];
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    sum--;
                }
                l++;
            }
        }
        return count;
    }
}
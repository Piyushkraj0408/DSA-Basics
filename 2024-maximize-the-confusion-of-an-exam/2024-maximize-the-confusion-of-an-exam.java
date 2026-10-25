class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;
        int ans = 0;
        char[] c = answerKey.toCharArray();
        int n = c.length;
        int fal=0;
        int min=Integer.MAX_VALUE;
        int tru=0;
        for(int r = 0;r<n;r++){
            char ch1 = c[r];
            if(ch1=='T'){
                tru++;
            }else{
                fal++;
            }
            while(Math.min(tru, fal) > k){
                char ch = c[l];
                if(ch=='T'){
                tru--;
            }else{
                fal--;
            }
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
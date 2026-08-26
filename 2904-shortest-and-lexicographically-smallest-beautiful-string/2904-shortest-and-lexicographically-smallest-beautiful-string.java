class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l  = 0;
        int one=0;
        String ans ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }

            while(one>k){
                if(s.charAt(l)=='1'){
                    one--;
                }
                l++;
            }

            if(one==k){
                while(s.charAt(l)=='0'){
                    l++;
                }
            String temp = s.substring(l,i+1);
                if (ans.equals("") || ans.length() > temp.length()
                        || (ans.length() == temp.length() && temp.compareTo(ans) < 0)) {
                    ans = temp;
                }
            }
        }
        return ans;
    }
}
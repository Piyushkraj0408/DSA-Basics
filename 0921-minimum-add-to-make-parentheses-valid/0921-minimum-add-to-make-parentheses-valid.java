class Solution {
    public int minAddToMakeValid(String s) {
        int c=0;
        int a=0;
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            if(p=='('){
                a++;
            }else{
                if(a>0){
                    a--;
                }else{
                    c++;
                }
            }
        }
        return a+c;
    }
}
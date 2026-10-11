class Solution {
    public boolean isPalindrome(int x) {
        int i,j=0;
        int c=x;
        while(x>0){
            i=x%10;
            j=j*10+i;
            x=x/10;
        }
        if(c==j)
        return true;
        else
        return false;
    }   
}

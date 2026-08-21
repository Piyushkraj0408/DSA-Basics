class Solution {
    public String longestCommonPrefix(String[] strs) {
        String min = strs[0];
        int k;
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<min.length()){
                min = strs[i];
            }
        }
        int i;
        for(i=0;i<min.length();i++){
                for(int j=0;j<strs.length;j++){
                    if (strs[j].charAt(i) != min.charAt(i)) {
                        return min.substring(0, i);
                }
            }
        }
        return min.substring(0,i);
    }
}